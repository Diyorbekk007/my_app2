package com.example.famousperson11.data.repository

import android.content.Context
import com.example.famousperson11.R
import com.example.famousperson11.data.model.FamousPersonData

class FamousRepository(private val context: Context) {
    private val ls = ArrayList<FamousPersonData>()
    fun getFamous(): List<FamousPersonData> {
        return ls
    }

    fun getFamousById(id: Int): FamousPersonData? {

        val data = ls.find { item ->
            item.id == id
        }
        return data
    }

    init {
        loadList()
    }

    private fun loadList() {
        addPerson(
            FamousPersonData(
                id = ls.size,
                name = "Alisher Navoiy",
                image = R.drawable.image_1,
                description = "Alisher Navoiy (1441-1501) - buyuk shoir va mutafakkir, davlat arbobi. To‘liq ismi Nizomiddin Mir Alisher. Navoiy tahallusi ostida chig‘atoy (eki o‘zbek tili) hamda forsiyda (fors tilidagi asarlarida) ijod qilgan. G‘arbda chig‘atoy adabiyoti hisoblanmish o‘zbek adabiyotining eng yirik namoyondasi. Umuman olganda, butun turkiy xalqlari orasida u kabi yirik shaxs yo‘qdir.\n" +
                        "\n" +
                        "Navoiy yoshligidan Xurosonning (Transoksaniya) bo‘lajak hukmdori Husayn Boyqaro bilan (1469-1506) do‘st bo‘lgan. 10-12 yoshidan she’rlar yozishni boshlagan. Navoiyning zamondoshi bo‘lmish tarixchi Xondamir (1473(76) -1534) qoldirgan ma’lumotlarga ko‘ra, mashhur o‘zbek shoiri Lutfiy (1369-1465) qarigan chog‘larida bolakay Navoiy bilan ko‘rishadi va uning she’riy iqtidorini yuqori baholaydi.\n" +
                        "\n" +
                        "Hayoti davomida Navoiy  musulmon Sharqining turli mamlakatlarida bo‘ladi, o‘z davrining taniqli shaxslari bilan ko‘rishadi. O‘zining she’riy mahoratini oshiradi. 1464-1465 yillar Navoiy ijodining shinavandalari uning ilk she’riy to‘plamini (devonlari) tayyorlashadi. Bundan ko‘rinib turibdiki, o’sha davrlardayoq Navoiy mashhur shoir bo‘lib ulgurgan. 1469 yilgacha temuriylar o‘rtasidagi o‘zaro ichki nizolar tufayli Navoiy o‘zining ona shahri Hirotdan uzoqda yashashga majbur bo‘lgan.\n" +
                        "\n" +
                        "1469 yil temuriy Husayn Boyqaro Hirotni egallaydi va Xuroson hukmdori bo‘ladi. Shu vaqtdan e’tiboran, Navoiy hayotining yangi bosqichi boshlanadi. U mamlakatning siyosiy hayotida faol ishtirok etadi. Shu yili Xuroson hukmdori Navoiyni davlat muhrdori etib tayinlaydi, 1472 yil vazir bo‘ladi. Egallagan mansabi orqali u mamlakatning madaniy va ilmiy taraqqiyotida katta yordam ko‘rsatadi. Katta mulk egasiga aylanadi.\n" +
                        "\n" +
                        "1480 yil Hirot shahrida va boshqa viloyatlarda o‘z hisobidan bir nechta madrasa, 40 ta rabot (yo‘lovchilar uchun bekat), 17 ta masjid, 10 ta so‘fiylar turarjoyi (xonaqoh), 9 ta hammom, 9 ta ko‘prik va boshqalarni qurdiradi. Biroq, saroy amaldorlariga Navoiyning bu kabi faoliyati yoqmaydi va turli fitnalar orqali Husayn Boyqaro bilan munosabatlarini buzishadi.\n" +
                        "\n" +
                        "Shunday qilib, Navoiy egallab turgan mansabidan ozod etilib, 1487 yil Astrobod shahriga hukmdor sifatida yuboriladi. Bu yerda u ikki yil xizmat qiladi. Mazkur muddat nihoyasiga yetgachgina, X. Boyqaro unga Hirotga qaytib, hokimiyatda mansabga ega bo‘lishiga ruhsat beradi. Lekin Navoiy bu taklifni rad etadi. Rad javobiga qaramay, Boyqaro sultonning yaqin kishisi lavozimini (“mukarrabi xazrati sultani”) taklif etadi. Bunday lavozimda Navoiy barcha davlat ishlari bilan bog‘liq ishlarda qaror qabul qilish huquqiga ega edi.\n" +
                        "\n" +
                        "Shu vaqtdan Navoiy hayotining yangi bosqichi boshlanadi va u ko‘proq ijod bilan shug‘ullanadi. U yaratgan asarlarining katta qismi aynan shu davrga tegishli. Navoiy temuriylarning so‘nggi hukmronlik yillarida (1370-1506) yashab ijod qilgan. Shuning uchun uning asarlarida jamoat ruhi, davrga xos muhim muammolar ustundir. 1490-1501 yillar Navoiy eng nafis, ijtimoiy-falsafiy va ilmiy asarlarini yaratgan.\n" +
                        "\n" +
                        "Alisher Navoiyning ijodi ulkan. Olti dostonining hajmi 60 000 ga yaqin misrani tashkil etadi. 1483-1485 yillar Navoiy o‘z ichiga besh dostonni olgan “Hamsa” asarini yaratgan: “Hayrat ul-Abror” (“Yaxshi kishilariing hayratlanishi”), “Farhod va Shirin”, “Layli va Majnun”, “Sab’ai sayyor” (“Yetti sayyora”), “Saddi Iskandariy” (“Iskandar devori”).\n" +
                        "\n" +
                        "Navoiyning “Hamsa”si mazkur janrda yaratilgan turkiy tildagi birinchi asar hisoblanadi. U - turkiy tilida ham bu kabi yirik ko‘lamdagi asar yaratilishi mumkinligini isbotlab berdi. Haqiqatan ham, Navoiy chig‘atoy tilida (eski o‘zbek tili) ham fors-tojik adabiyoti bilan bir darajada turuvchi asar yaratish mumkinligini isbotlashga harakat qilgan. Va u o‘zining besh hazinasi orqali buning uddasidan chiqqan.\n" +
                        "\n" +
                        "Navoiy musulmon Sharqining, deyarli barcha janrlarida o‘z qalamini sinab ko‘radi va o‘z ovozi, o‘z uslubi borligini ko‘rsata oladi. Sharq adabiyotida “Layli va Majnun” mavzusida 120 dan ziyod doston yaratilgan. Navoiy ham shaxsiy yondashuvi ila ushbu mavzuda doston yozadi. Dostonda Layli va Majnun o‘rtasidagi sevgi bayon qilinadi. O‘z ifodasida Navoiy odamiylik va so‘fiylik sevgisini sharhlashga harakat qilgan. O‘zining so‘fiylik qarashlarini Navoiy, shuningdek, “Farxod va Shirin”, “Hayrat ul-Abror” dostonlarida ham ifodalagan. Uning dostonlarida so‘fiylik mavzusi umumfalsafiy darajaga ko‘tarilgan.\n" +
                        "\n" +
                        "Mazkur dostonlarda, bir vaqtning o’zida shoirning insonparvarlik dunyo qarashlari orqali dunyoning dolzarb muammolari qo‘yiladi. “Hamsa”dagi boshqa ikki dostonida - “Sab’ai sayyor” (“Yetti sayyora”), “Saddi Iskandariy” (“Iskandar devori”) hukmdor bilan bog‘liq muammolar (Qayumov A. Saddi Iskandariy. Toshkent, 1980 yil, o‘zbek tilida) yetakchi o‘ringa chiqadi.\n" +
                        "\n" +
                        "Ma’lum bo‘lishicha, Navoiy temuriylar saroyiga yaqin bo‘lib, do‘sti va podshoh Husayn Boyqaroga ta’sir ko‘rsata olgan. Shu sababli, Navoiy bu dostonlarida H. Boyqaroga qaratilgan g‘oyalarni ifodalab o‘tgan: dunyoning va shoh taxtining o‘zgaruvchanligi; hukmdorning o‘z xalqi oldidagi majburiyatlari... Hamsanafislik an’analariga nisbatan, Navoiy o‘zining ijtimoiy va siyosiy qat’iyati va o‘ziga xosligi bilan ajralib turadi. Abd ar-Rahmon Jomiy (1414-1492) Navoiyning “Hamsa”sini o‘qib, unga juda yuqori baho bergan.\n" +
                        "\n" +
                        "O‘zining ijtimoiy va badiiy mohiyatiga binoan, Navoiyning “Hamsa”si O‘rta Osiyoda yuqori o‘ringa ega bo‘lgan. U ko‘p marotaba qayta ko‘chirilgan. Hozirgi kunda “Hamsa” yoki uning dostonlarining katta ro‘yhati mavjud. Birgina Abu Rayhon Beruniy nomidagi sharqshunoslik instituti fondining o‘zida XV-XX asrlarda qayta ko‘chirilgan 166 ta qo‘lyozma bo‘lib, ular to‘liq “Hamsa” asari yoki uning alohida dostonlarini tashkil etadi. Shulardan 84 tasi to‘liq doston  ko‘rinishidadir. Navoiy “Hamsa”sining miqdori va keng tarqalishi uni O‘rta Osiyo intellektual hayotida alohida o‘rin egallaganligini ko‘rsatadi.\n" +
                        "\n" +
                        "Alisher Navoiy butun hayoti davomida adabiy asarlarni siyosat bilan birlashtirgan. Yuqori mansabga ega shaxs bo‘la turib, u mamlakat hayotining ijtimoiy-iqtisodiy takomillashishiga katta hissa qo‘shgan; ilm, fan, san’at rivojiga homiylik qilgan№ tinchlik va totuvlik doimo hukmron surishiga doim harakat qilgan.Navoiy forsiy tilida yozilgan o‘z she’rlarini “Devoni Foniy” nomi ostida jamlagan. U fors shoirlari bilan ham bellashmoqchi bo‘lgan. To‘plam shaklida chiqarilgan g‘azallarini o‘zini hisoblasak, ular 3150 donani tashkil etadi. Navoiy yozgan she’rlarining miqdoriga ko‘ra peshqadam, desak mubolag‘a bo‘lmaydi. Shuningdek, Navoiy fors tilidagi qasidalarini jamlab, “Sittai zaruriya” (“Olti zaruriyat”) va “Fusuli arbaa” (“Yilning to‘rt fasli”) nomli ikki to‘plam yaratadi.\n" +
                        "\n" +
                        "Navoiy o‘z she’riyati orqali o‘zbek (chig‘atoy) adabiyotini yangi darajaga olib chiqdi. Navoiyning nazmi mavzusining kengligi hamda janrining xilma-xilligi bo‘yicha undan oldingi o‘zbek adabiyotini ortda qoldiradi. U nazmda dostonlardagi kabi dunyoviy va diniy, so‘fiylikning dolzarb masalalarini ifoda qilgan. Navoiyning diniy asarlari ham nashr qilingan: “Arbain” (“Qirq ruboiy”), “Munadjat” (“Allohga iltijo”).\n" +
                        "\n" +
                        "So‘fiy prozaik asari “Nasaim al-muhabbat” (“Muhabbat shabadasi”)ning to‘liqroq matni nashr qilingan bo‘lib, unda 750 ta so‘fiy shayhlar haqida ma’lumot keltirilgan. Navoiy ilmiy asarlar ham yaratgan. Ular qatoriga fors va turkiy tillar qiyosi keltirilgan asarlarni kiritish mumkin: “Muhokamat al-lug‘atayn” (“Ikki til bahsi”); aruz nazariyasiga oid (she’r yozish hajmi) - “Mezon al-avzan” (“Hajm mezoni”), muammo janri nazariyasiga oid - (jumboq) “Mufradat”.\n" +
                        "\n" +
                        "Bundan tashqari, u tarixiy mavzularda risolalar yaratgan: “Tarixi muluki Adjam” (“Eron shohlari tarixi”), “Tarixi anbiya va xukama” (“Payg‘ambarlar va donolar tarixi”). Badiiy maktublarini “Munshaat” to‘plamiga jamlagan. Uning shoh asarlari: Abd Ar-Rahmon Jomiy hayoti haqida - “Xamsat al-mutaxayyirin”, 1494, “Xalati Sayyid Xasan Ardasher” (“Sayyid Xasan Ardasher hayoti”), “Xalati Pahlavon Muhammad” (“Pahlavon Muhammad hayoti”)lardan iborat.\n" +
                        "\n" +
                        "Alisher Navoiyning so‘nggi asari “Mahbub ul-qulub” (1500). Unda shoirning so‘nggi ijtimoiy va siyosiy qarashlari yoritilgan.\n" +
                        "\n" +
                        "Alisher Navoiy butun hayoti davomida adabiy asarlarni siyosat bilan birlashtirgan. Yuqori mansabga ega shaxs bo‘la turib, u mamlakat hayotining ijtimoiy-iqtisodiy takomillashishiga katta hissa qo‘shgan; ilm, fan, san’at rivojiga homiylik qilgan; tinchlik va totuvlik hukmron surishiga doim harakat qilgan.\n" +
                        "\n" +
                        "Ko‘rib turganimizdek, Navoiy merosi mavzu va janrlari bo‘yicha turlidir. Uning asarlari XV asrdan hozirgi kungacha o‘zbek adabiyoti rivoji uchun xizmat qilib kelmoqda. Asrlar davomida uning asarlari taqlid va ilhom manbai bo‘lib hisoblanib kelgan."
            )
        )
        addPerson(
            FamousPersonData(
                id = ls.size,
                name = "Amir Temur",
                image = R.drawable.image_2,
                description = "Amir Temur O‘rta, Janubiy va G‘arbiy Osiyo, shuningdek, Kavkaz, Povoljya va Rus tarixida muhim o‘rin tutgan O‘rta Osiyolik turkiy hukmdor, sarkarda va zobit. Sarkarda, poytaxti Samarqand bo‘lgan Temuriylar saltanati (1370 yil) asoschisi.\n" +
                        "\n" +
                        "Amir Temur 1336 yil 9 aprel kuni Kesh (Shahrisabz) yaqinidagi Xo‘ja Ilg‘or (Yakkabog‘) qishlog‘ida tug‘ilgan. Rivoyatlarga ko‘ra, u qo‘lida qip-qizil qon bo‘lagi bilan, sochlari esa mo‘ysafid kabi oppoq holatda tug‘ilgan, bunday holat Chingizxon haqida ham gapirilgan. Uning otasi amir Muhammad Tarag‘ay turk avlodining barloslaridan bo‘lib, Movarounnahrda o‘ziga yarasha obro‘-e’tiborga ega, nufuzli ziyolilardan bo‘lgan. Uning ota-bobosi afsonaviy turkiy Alan quva shajarasidan kelib chiqqan bo‘lib, Chig‘atoy ulusining saroydagi obro‘-e’tiborli kishilari qatoridan joy olgan. Kesh va Nefes atrofidagi yerlar ularga qarashli mulk hisoblangan.\n" +
                        "\n" +
                        "Temurning otasi Tarag‘ay doimiy ravishda xon ulusi bo‘lmish Il daryosi qirg‘og‘iga chaqiriluvchi chig‘atoy beklari qurultoylarida ishtirok etgan. 1355 yil u Turmush og‘a barlosi amir Jakuning qiziga uylanadi.\n" +
                        "\n" +
                        "Movaraunnahrning bosh amiri Qozag‘on Amir Temurning qobiliyatlariga ishonch hosil qilib, shu yiliyoq unga nevarasi Uljay Turkan og‘ani nikohlab beradi. Ushbu nikoh sharofati bilan Qazog‘onning nevarasi amir Husayn va Amir Temurlar ittifoqi vujudga keladi. Bu ittifoq mo‘g‘ullarga qarshi kurashda juda qo‘l keladi. 1356 yil Amir Temurning 2 o‘g‘li dunyoga keladi — Jahongir va Umar Shayh.\n" +
                        "\n" +
                        "XIII asr boshi XIV asr oxirlariga kelib Movaraunnahrning iqtisodiy ahvoli kundan-kunga yomonlashib boradi. Bundan Mo‘g‘uliston xoni Tug‘luq Temur foydalanib qoladi va hech qanday qarshiliksiz Qashqadaryogacha yetib boradi. Amir Temur unga xizmat qilishni boshlaydi. Biroq, Tug‘luq Temur Movaraunnahr hukmdori etib o‘zining o‘g‘li Ilyos Xodjani tayinlaydi va Amir Temur shahzodaga xizmat qilishdan bosh tortib, Balx hukmdori amir Husayn bilan birlashib olib, mo‘g‘ullar bilan qat’iy jangga kirishadi.\n" +
                        "\n" +
                        "Bu vaqtda Samarqandda sarbadorlar - “dorga osiluvchilar”, shuningdek, mo‘g‘ullarga qarshi kurashuvchilar hukmron surgan. Mazkur xalq harakatining “Yoki ozodlik uchun kurash, yoki dorga osilgan kalla” shiori ham uning ishtirokchilari tomonidan yaratilgan. 1370 yil Amir Temur Balxda bo‘lib o‘tgan qurultoyda Turonning bosh amiri etib e’lon qilinadi.\n" +
                        "\n" +
                        "Chingizning qizi Saroy Mulk Xonim bilan nikohi esa Amir Temurga “gurgan”, ya’ni “xonning kuyovi” faxriy unvonini berdi.\n" +
                        "\n" +
                        "Amir Temurning asosiy vazifasi parchalangan davlatga bardosh berish va alohida yerlarni bir davlatga birlashtirishdan iborat bo‘lgan. Mazkur davlatning poytaxti etib u Samarqandni tayinlab, tezkorlik ila shaharning himoya devorlarini, qo‘rg‘onlar va saroylarni barpo etishni boshlaydi.\n" +
                        "\n" +
                        "Amir Temur Amudaryo va Sirdaryo orasidagi yerlarni, shuningdek, Farg‘ona va Shosh viloyatlarini o‘ziga bo‘ysundirib, birlashtiradi, so‘ngra bosqinchilik yurishlarini boshlaydi.\n" +
                        "\n" +
                        "Amir Temur hukmronligi 35 yil davom etgan (1370 - 1405). U Ind va Gangdan Sirdaryo va Zarafshongacha, Tyan Shandan Bosforgacha bo‘lgan katta saltanatni yaratgan. Hayotining katta qismini yurishlarda o‘tkazgan.\n" +
                        "\n" +
                        "Amir Temur 1405 yil Xitoyga yurishi vaqtida O‘tror shahrida vafot etgan.\n" +
                        "\n" +
                        "Amir Temurning hayotlik vaqtida davlat boshqaruvi haqida so‘zlovchi “Temur tuziklari” nomli maxsus asar yozilgan. Asar ikki qismdan iborat bo‘lib, O‘rta asrning bebaho tarixiy manbasi hisoblanadi. Unda Temurning hayotiy voqealari bilan bog‘liq tarjimai xoli, atoqli davlat arbobi va sarkardaning harbiy san’atga bo‘lgan nuqtai nazari, davlat tuzilishi va boshqaruvi kabilar bayon qilingan. Amir Temur tomonidan yaratilgan markazlashgan, kuchli boshqaruvga ega davlat ushbu bebaho qoidalar majmuasi hisoblanmish kitob asosida yaratilgan.\n" +
                        "\n" +
                        "Yirik davlatni yaratib, Amir Temur mamlakatning iqtisodiy va madaniy rivoji uchun sharoitlarni tayyorlagan. O‘tgan davrlarning qadimiy an’analari yangi tarixiy ko‘rinishda qayta tiklanadi. Yaqin va O‘rta sharq bo‘ylab Movaraunnahr savdo-sotiq, iqtisod va madaniyat markaziga aylanishi zamirida, Samarqand, Kesh, Buxoro, Termiz, Toshkent, Marv va boshqa qadimiy shaharlar obodonlasha boshlagan.\n" +
                        "\n" +
                        "Masjid, madrasa, maqbara, karvon-saroy va hammomlarning katta binolari qad rostlay boshlagan. Har qanday g‘alaba me’morchilikda abadiylashishi odatiy holatga aylanib qolgan. Quruvchilik faoliyatida Amir Temur ma’lum bir siyosiy maqsadlarga amal qilgan - u qurdirgan inshootlar saltanatining kuch-qudratini ko‘rsatib bera olishi kerak bo‘lgan.\n" +
                        "\n" +
                        "Boshqaruv yillari davomida Amir Temur feodal tarqoqlikka barham beradi, Fransiya, Angliya, Kastiliya kabi yirik Ovrupa qirolliklari bilan savdo-diplomatik aloqalarni yo‘lga qo‘yadi. Afsuski, Amir Temurning vafotidan so‘ng G‘arbiy Ovrupa bilan savdo-diplomatik aloqalar nihoyasiga yetadi.\n" +
                        "\n" +
                        "Amir Temur tarix sahifalarida Aleksandr Makedonskiy, Dariy Perviy, Yuliy Sezar kabi yirik sarkardalar bilan bir qatorda turadi.\n" +
                        "\n" +
                        "Amir Temur — insoniyat tarixidagi eng qat’iyatli shaxslardan biridir. Turli manbalarga tayangan holda, u haqidagi bilimlarimizda ham hukmdor, zobit, sarkarda, ham jangchi sifatida gavdalanadi."
            )
        )
        addPerson(
            FamousPersonData(
                id = ls.size,
                name = "Mirzo Ulug'bek",
                image = R.drawable.image_3,
                description = "Mirzo Muhammad ibn Shohruh ibn Temur Ulug‘bek Qo‘rag‘oniy (1394-1449) - buyuk astronom va matematik, o‘z davrining atoqli allomasi, davlat arbobi, Movaraunnahrni 1441-1449 yillar boshqargan, mashhur hukmdor va sohibqiron Amir Temurning nabirasi.\n" +
                        "\n" +
                        "Ulug‘bek (Muhammad Tarag‘ay) 1394 yil 22 mart kuni hozirgi Ozarbayjon hududidagi Sultoniya shahrida tavallud topgan.\n" +
                        "\n" +
                        "1405 yil, Markaziy Osiyodan tashqari, Yaqin va O‘rta Sharqning barcha hududi, O‘rtayer dengizidan Shimoiy Hindistongacha bo‘lgan katta yerni o‘z ichiga olgan ulkan saltanatni yaratgan buyuk sohibqironning o‘limidan so‘ng, butun merosiy mulki uning o‘g‘il va nabiralariga o‘tadi. Temuriylar saltanatining tepasiga Hirot qarorgohida saylangan Temurning o‘g‘li - Shohruh o‘tiradi.\n" +
                        "\n" +
                        "Mavaraunnahr boshqaruvi Shohruhning to‘ng‘ich o‘g‘li, Amir Temurning nabirasi Ulug‘bekka topshiriladi. 1409 yil Ulug‘bek Samarqand hokimi etib e’lon qilinadi, otasi Shohruhning o‘limidan so‘ng, 1447 yil Temuriylar sulolasiga bosh bo‘ladi.\n" +
                        "\n" +
                        "Yoshligida Ulug‘bek fan va san’at turlariga, ayniqsa, matematik va astronomiyaga katta qiziqish bildiradi. Uning aqliy dunyoqarashi kengayishida otasi va bobosi to‘plagan boy kutubxona zamin bo‘ldi, u yerda ko‘p vaqtini o‘tkazardi.\n" +
                        "\n" +
                        "Ulug‘bek u vaqtlar o‘lchovi bilan qaraganda, juda zo‘r ta’lim olgan. Ajoyib xotira egasi bo‘lib, u arab va fors tilini erkin egallagan, turk she’riyatini yaxshi bilgan, adabiy uslublarni egallagan va adabiy bahslarda ishtirok etgan. O‘zi ham she’rlar yozgan. Ulug‘bekning ustozi taniqli olim, Temuriylar saroyidagi mashhur matematik va astronom Qozizoda Rumiy bo‘lgan. U to‘qqiz yasharli Ulug‘bekka Marog‘adagi mashhur rasadxona xarobalarini ko‘rsatgan. Yoshlikdagi aynan shu xotiralari bo‘lajak astronom kelajagini belgilagan bo‘lishi mumkin. Ulug‘bek davrida Samarqand o‘rta asrlar davridagi ilm-fan o‘choqlaridan biriga aylangan. Samarqandda, XV asrning birinchi yarmida Ulug‘bekning atrofida G‘iyosiddin Jamshid Koshiy, Qozizoda Rumiy, Ali Qushchi kabi taniqli astronom va matematiklarni birlashtirgan butun bir ilmiy maktab vujudga keldi. U vaqtlar Samarqandda O‘rta Osiyo tarixi haqida ajoyib asar yozgan tarixshunos Hofiziy Abru, taniqli shifokor Mavlono Nefis, shoirlar Sirojiddin Samarqandiy, Sakkokiy, Lutfiy, Badaxshiy va boshqalar yashagan. Ular insoniyat aqli, fanning kuchiga ishongan o‘z davrining ilg‘or shaxslari bo‘lishgan.\n" +
                        "\n" +
                        "1417-1420 yillar Ulug‘bek Samarqandda madrasa qurdirib, Registonda barpo etilgan birinchi me’moriy ansamblga aylanadi. Ushbu madrasaga Ulug‘bek islom olamining ko‘plab astronom va matematiklarini taklif etadi. Qolgan ikkita madrasa G‘ijduvon va Buxoroda qurilgan. Ulug‘bek tomonidan qurilgan madrasalar universitet vazifasini bajargan. Ulug‘bekning Buxoroda qurdirgan madrasasi peshtoqida “Ilmga intilish har bir musulmon uchun farzdir” yozuvi saqlanib qolgan.\n" +
                        "\n" +
                        "Ammo Ulug‘bekning katta ishtiyoqi - bu astronomiya bo‘lgan. Ulug‘bek hayotining mazmuni va Qozizoda Rumiy, Jamshid G‘iyosiddin al Koshiy, Ali Qushchi kabi astronom izdosh-olimlar rasadxona qurilishiga turtki bo‘lgan.\n" +
                        "\n" +
                        "Tadqiqotchi olimlarning fikricha, rasadxona qurilishi 1428-1429 yillan yakunlangan. Rasadxona o‘z davrining nodir binosi bo‘lgan. Yer silkinishiga bardoshli bo‘lishi uchun bino qurilishi uchun Qo‘hak tepaligining toshli etagi tanlangan.\n" +
                        "\n" +
                        "Asosiy asbob - sekstant (burchak o‘lchagich) - janubdan shimol tomon meridian chiziqlari bo‘ylab mo‘ljallangan. Asosiy asbobdan tashqari, rasadxonada boshqa astronomik anjomlar ham bo‘lgan.\n" +
                        "\n" +
                        "Ehtimol, aniq astronomik kuzatishlarni amalga oshirishiga sekstantning o‘lchami, uning qulay tuzilishi, Ulug‘bekning bilimlari va uning sherigi sabab bo’lgan. Buyuk astronom Ulug‘bek rahbarligi va ishtirokida rasadxonaning asosiy ishi “Zidjiy Ko‘rag‘oniy”, “Ulug‘bekning yulduzlar jadvali” tuzilgan. Kitobda ushbu Samarqand observatoriyasidan 1018 ta yulduz joylashuvi aql bovar qilmas aniqlikda, Gipparxdan so‘ng ilk bor belgilangan. Astronomik turkum yaratilishi jahon astronomiya fani xazinasiga qo‘shilgan ulkan hissa hisoblanadi.\n" +
                        "\n" +
                        "Bundan tashqari, rasadxonada ekliptikning ekvatorga qiyaligi va yulduz yilining uzunligini belgilash; sinusning bir burchakdagi ahamiyatini - muhim astronomik doimiylikni - verguldan so‘ng o‘n sakkizinchi belgigacha aniqlikda hisoblash bo‘yicha ishlar olib borilgan.\n" +
                        "\n" +
                        "Ulug‘bek o‘z ma’lumotlarini bir necha bor tekshirib, uning sonlarini to‘g‘ri, degan xulosaga keladi. 1437 yil u astronomik yil uzunligini aniqlaydi: 365 kun 6 soat 10 daqiqa 8 soniya. Keyinroq o‘zgarishlar farqi 58 soniyada ekanligi aniq bo‘lgan. Agar astronomik yil uzunligi 31 million 558 ming 150 soniya ekanligini inobatga olsa, Ulug‘bek o‘z o‘lchamlarini naqadar yuqori aniqlikda olib borganligiga amin bo’lish mumkin.\n" +
                        "\n" +
                        "Buyuk olim bo‘lish bilan birga, Ulug‘bek kuchsiz sarkarda edi. Asosiy vaqtini rasadxonada o‘tkazar edi va davlat ishlariga kam vaqt ajratgan. Ulug‘bekning to‘ng‘ich o‘g‘li Abdulatif, ruhoniylarning keskin ta’siri ostida otasiga qarshi urush e’lon qiladi. O‘g‘li otasiga Makka ziyoratiga borishlikni taklif qiladi. 1449 yil Makkaga safari chog‘i Ulug‘bek shariat qaroriga muvofiq, xoinona o‘ldiriladi.\n" +
                        "\n" +
                        "Buyuk Ulug‘bekning fojiali o‘limidan so‘ng, uning yorqin yulduzi so‘nmadi. Ulug‘bekning sodiq shogirdi Ali Qushchi, ona Samarqandini tark etishga majbul bo‘lib, Ulug‘bekning “Zidjiy Ko‘rag‘oniy” kitobini Ovrupaga olib chiqib ketadi. Keyinchalik kitob ko‘plab olimlar avlodining mulkiga aylandi. Ulug‘bekning ismi va mehnatlari Ovrupa va Osiyo olimlari orasida mashhur bo‘ldi. XVII asrda Yan Geveliy tomonidan nashr etilgan Ulug‘bekning “Yulduzli osmon turkumi”da turli zamon va makonlarda yashab o‘tgan buyuk dunyo astronomlarining aksi tushirilgan naqsh mavjud. Ular astronomiya ilhom manbai bo‘lmish Uraniyaning ikki tomonida stol qarshisida o‘tirishgan holda aks ettirilgan. Ular orasida Ulug‘bek ham bor. Nashq muallifi Ulug‘bekni portretiga ega bo‘lmay, uning suratini tushirgan.\n" +
                        "\n" +
                        "Ulug‘bekning asosiy ilmiy mehnati “Zidjiy jadidi Ko‘rag‘oniy” hisoblanadi yoki “Gurgonning yangi astronomiy jadvali” deb nomlanadi. Muallif ushbu asarni 1444 yil, o‘ttiz yillik tirishqoqlik va astronomik kuzatuvlardan so‘ng yakunlagan. Astronomik ma’lumotnoma tez orada, Klavdiya Ptolemeyning “Almagest”  hamda butun Ovrupa rasadxonalarida qo‘llanma hisoblangan kastiliya qiroli Alfons XVning astronomik jadvali bilan bir vaqtda lotin tiliga o‘girilgan.\n" +
                        "\n" +
                        "Mazkur jadvallarning aniqligi avvalroq Sharqda hamda Ovrupada erishilgan yutuqlardan ilgarilagan. XVII asrga kelibgina, Tixo Brag samarqandlik kuzatuvlarga teng keladigan aniqlikka muvaffaq bo‘lib, keyinroq, undan ham aniqroq natijaga erishgan. “Ulug‘bekning Zidji” Sharqda bo‘lgani kabi, Ovrupa astronomlarining diqqatini o‘ziga tortganligining hayratlanarli yeri yo‘q.\n" +
                        "\n" +
                        "“Ulug‘bekning Zidji” to‘rt yirik qilsmdan iborat. Xronologiya nomini olgan birinchi qismida turli Sharq xalqlari tomonidan qabul qilingan xronologik usullar bayon etilgan. Ikkinchi qismida amaliy astronomiya masalalari ifodalangan, uchinchisi — dunyoning geomarkaziy tizimi asosida ko‘zga ko‘rinarli yulduzlar harakati haqida ma’lumot bersa, to‘rtinchisi astrologiyaga bag‘ishlanadi — o‘rta asrlar dunyoqarashi fanining muqarrar taqdiri.\n" +
                        "\n" +
                        "Ulug‘bek hisoblab chiqqan 1018 yulduz turkumi qadimiy xronogiyani o‘rganuvchi astronomlar va tarixshunoslar uchun kompas vazifasini o‘taydi. Ulug‘bekning yulduzlar jadvali “Almagest”da keltirilgan Ptolomeyning yulduzlar xaritasining haqiqiyligini tasdiqlaydi.\n" +
                        "\n" +
                        "1648 yil Oksfordda — fan va madaniyatning eng qadimiy o‘choqlaridan bo‘lmish Angliyada ilk bor Ulug‘bekning mashhur Samarqand rasadxonasida amalga oshirilgan asosiy ishi qisman nashr etilgan. Ishni nashr uchun tayyorlab, unga sharh yozgan Jon Grivs (1602 - 1652), Oksford universitetining astronomiya professori. Keyinchalik, turkum lavhalari Angliyada bir necha bor chop etilgan.\n" +
                        "\n" +
                        "Ilk oksfordlik nashrdan 17 yil o‘tgach, olim, Oksforddagi Bodleyansk kutubxonasi qo‘riqchisi, angliyalik sharqshunos va tarjimon Tomas Xayd (1636-1703) samarqandlik nashrni fors va lotin tillarida yangi nashr uchun tayyorlab, “Tabulae Long, as Lat. Stellarum Fixarum, ex observatione Ulugh Beighi”, Oxonii nomlari ostida chop etgan, 1665.\n" +
                        "\n" +
                        "Ulug‘bek jadvallarining Ovrupada chop etilishi, shu o‘rinda, tuzish uchun ulkan va sermashshaq kuzatuv va hisob mehnatini talab qiluvchi o‘ziga xos yulduzlar katalogi sanoqli shaxslar tomonidan hisoblangan va osmon tadqiqotchilari tomonidan yuqori baholangan.\n" +
                        "\n" +
                        "Xaydning oksfordik nashridan 25 yil o‘tgach, Ulug‘bek jadvalining ma’lumotlari polyak astronomi Yan Geveliyning (1611-1687) Gdanskda chop etigan “Prodromus Astronomiae” kitobi sahifalaridan joy oladi. Bu yerda o‘z vaqtida mavjud bo‘lgan turkumlardagi ma’lumotlar o‘rtasida taqqoslash keltirilgan: Ptolemey, Tixo Brag, Richchioli, shahzoda Gass va Geveliy.\n" +
                        "\n" +
                        "1839 yil fransuzs sharqshunosi L.A.Sediyo (1808-1876) Ulug‘bek jadvalini “Tables astronomigue d'Oloug Beg, commentees et publiees avec le texte en regard” nomi ostida qisman chop ettiradi, I bob, I bo‘lim, Parij, 1839.\n" +
                        "\n" +
                        "Va, nihoyat, Buyuk Britaniya kutubxonalarida saqlangan 8 ta qo‘lyozmani o‘rganish asosidagi Ulug‘bek jadvalining aniqroq tahlili 1917 yil AQShda E. B. Nobl tomonidan “Ulugh Beg's Catalogue of Stars. Revised from all Persian Manuscripts Existing in Great Britain” nomi ostida chop etilgan.\n" +
                        "\n" +
                        "Aytish joizki, Ovrupa va Osiyo kitob saqlanuvchi omborlarda “Zidjiy”ning o‘nlab qo‘lyozmalari mavjud. Ulug‘bekning yulduzlar jadvali o‘rta asrlar astronomiyasining so‘ng so‘zi bo‘ldi. Mazkur jadval teleskop ixtirosidan avvalgi, o‘rta asrlar astronomiya fanining eng yuqori  poyasi bo‘ldi.\n" +
                        "\n" +
                        "Ulug‘bekning boy ilmiy merosi u faqatgina buyuk musulmon o‘g‘loni bo‘lmaganligini tasdiqlaydi. Ijodiy tafakkur dahosi butun insoniyat ilm-fani va sivilizatsiyasi rivojiga bebaho hissa qo‘shgan. Shu sababli, ko‘p asrlar o‘tib, hatto bugun ham Ulug‘bekning ismi savob maqsadlarga erishish niyatida Sharq va G‘arb xalqlarini birlashtirgan timsol bo‘lib qoladi.\n" +
                        "\n" +
                        "Mirzo Ulug‘bekning yuqori ma’naviy va sezilarli merosi dunyoning yetakchi o‘quv muassasalarida va ilmiy markazlarida o‘rganib kelinadi. O‘zbekiston Respublikasining Birinchi Prezidenti Islom Karimovning tashabbusi bilan, O‘zbekiston Milliy universiteti ushbu atoqli olim sharafiga nomlanganligi respublikaning bugungi yuqori ilmiy-ma’naviy qudratini tasdiqlaydi.\n" +
                        "\n" +
                        "1994 yil olim tavalludining 600 yillik yubileyi xalqaro miqyosda nishonlangan, shu sabab, xorij olimlari, mutaxassislari va jamoat arboblari ishtirokida bir qator tadbirlar o‘tkazilgan.\n" +
                        "\n" +
                        "2009 yil Parijda Mirzo Ulug‘bek tavalludining 615 yilligiga bag‘ishlangan xalqaro ilmiy anjuman o‘tkazilgan. Anjumanda 130 dan ziyod olimlar va turli xalqaro tashkilot vakillari ishtirok etgan.\n" +
                        "\n" +
                        "O‘tkazib kelinayotgan tadbirlardan butun dunyoda Mirzo Ulug‘bekning ilmiy va ma’naviy merosiga bo‘lgan qiziqish naqadar ulkanligi yaqqol ko‘rinib turibdi."
            )
        )
        addPerson(
            FamousPersonData(
                id = ls.size,
                name = "Zahiriddin Muhammad Bobur",
                image = R.drawable.image_4,
                description = "Zahriddin Muhammad Bobur — buyuk o‘zbek shoiri, mutafakkir, tarixshunos va davlat arbobi; boburiylar sulolasi va saltanati asoschisi. Boburning ilmiy mehnatlari orasida “Aruz haqida risola” (1523-25) alohida o‘rin egallaydi, unda sharqiy aruz vazni ko‘rib o‘tiladi. 1521 yil islomning beshta shariat ustuni bayon etilgan falsafiy-diniy “Mubayyin” asarini yozgan.\n" +
                        "\n" +
                        "Zahriddin Muhammad Bobur 1483 yil 14 fevral kuni Andijonda tavallud topgan, Farg‘ona hukmdorining o‘g‘li, Amir Temurning evarasi. Bobur 1494 yil Farg‘ona hokimi bo‘ladi, 1526 yil Hindistonda markazlashgan boburiylar davlatiga (jahon tarixiga “buyuk mo‘g‘ullar saltanati” bo‘lib kirgan) asos solib, Hindiston inglizlar tomonidan bosib olinishiga qadar (1848) mavjud bo‘lgan. Agra shahrida 1530 yil 26 dekabr kuni vafot etgan.\n" +
                        "\n" +
                        "Boburning she’riy merosi ko‘pqirrali va boy. Nasriy asarlari (1519) “Qobul devoni”ga, so‘nra (1529-30) “Hind devoni”ga jamlangan. U sharq nasriy janrlarida 10 dan ziyod she’rlar yozgan. She’rlarida uning shaxsiy hayoti, atrof-muhiti va tarixiy hodisalar aks etilgan. Bobur she’riyatining asosini ishqiy-nasriy mazmundagi she’rlar tashkil etadi. Shoir san’ati o‘ziga xos adabiy uslub va mahorat, turkiy tilning ifodaliroq vositalari orqali tasvirlanadi.\n" +
                        "\n" +
                        "Uning she’rlarida o’z davrining tarixiy hodisalari, shoirning shaxsiy hayoti, atrof-muhit, insonga bo‘lgan munosabat, din, davr an’analari va axloqlari voqe’lik ila aks etgan.\n" +
                        "\n" +
                        "Boburning she’rlari — shoirning tarjimai xoli, desak mubolag‘a bo‘lmaydi. U orqali ijodkor shoirona til orqali teran tuyg‘ularni bayon qiladi, hayotiy hodisalar to‘qnashuvi natijasida hosil bo‘lgan tashvishlarni mohirona so‘zlaydi.\n" +
                        "\n" +
                        "Bobur she’riyatining asosini ishqiy-nasriy she’rlar tashkil etadi. Ijodining asosiy qirralaridan biri, chinakam insoniy, dunyoviy, haqiqiy sevgini kuylaganligidir. Shoir lirikasi Alisher Navoiy she’riyatidan ilhomlanish bilan to‘yingan. O‘zining g‘azal va ruboiylarida u sevgi, do‘stlik, go‘zallikka intilish kabi insoniy muammolarni ko‘targan. Dunyoviy sevgini shoir insonning eng porloq unvoni sifatida tarannum etadi. \n" +
                        "\n" +
                        "Bobur she’riyatida, shuningdek, insonning axloqi va diniy mukammalligi masalalari ko‘tarilgan. Shoir insonni yuqorilarga ko‘tarib, unga ulkan hurmat ila munosabatda bo‘ladi, inson qadr-qimmatini baland qo‘yadi. Bu g‘oyalarga zid bo‘lga barcha narsaga qarshi chiqadi. Boburning fikricha, xudbinlik, hurmattalablik, qizg‘anchig‘lik, manmanlik - noqobil sifatlardir. Shoir odamlarga samimiy maslahatlar beradi. O‘zining ruboiylarida inson qanday qilib o‘zini ma’nan tarbiyalashi kerakligi haqida gapiradi.\n" +
                        "\n" +
                        "Mazkur mavzuga yuzlanar ekan, insonning hayotdagi eng asosiy vazifasini shoir yaxshilik, bag‘rikenglik va haqiqatda ko‘radi. Do‘stlik - insonning eng asosiy jihati va dushman bilan kurashda ulkan kuch deb hisoblaydi.\n" +
                        "\n" +
                        "Bobur asarlaridagi adabiy til haqida so‘z borar ekan, undagi soddalik, hammaboplik, ravon va qisqaligini aytish lozim. Shoir balandparvoz gaplarni va mukammal iboralarni yoqtirmagan. Boburning sodda tili o‘quvchiga asarlarini, boy ifodalari va kechinmalarini aniq o‘zlashtirishda yordam beradi.\n" +
                        "\n" +
                        "Bobur ma’nosiz gap-so‘zlardan qo‘chishga, o‘z fikrlarini qisqa, ravon va oddiy bayon etishga, inson o‘zi tushunmaydigan so‘zlardan foydalanmaslikka chaqiradi. Xususan, u shunday ta’kidlaydi: “Ravshan va toza gaplar yordamida, soddaroq yoz: va senga ham, seni xatingni o‘qiganga ham oson bo‘ladi”.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Shubhasiz, “Boburnoma”ning ushbu satrlaridan ma’lumki, Boburning she’riy mahorati nasriy asarlariga chuqur va sezilarli ta’sir ko‘rsatib, ulkan badiiy go‘zallik va keng shuhrat baxsh etdi.\n" +
                        "\n" +
                        "Boburning she’riy mahorati badiiy-adabiy uslub va ona tilining eng ta’sirchan vositalaridan mahorat ila foydalanish hamda xalq ijodiyoti manbalarining ijodiy tiklanishida ifodalanadi.\n" +
                        "\n" +
                        "Ilmiy asarlari orasida “Aruz haqida risola”si Sharq filologiyasi rivojida alohida o‘rin egallagan. Asar she’riyatning she’riy asoslarini ehtiyotkorona va erishgan yutuqlarining tanqidiy o‘zlashtirish natijasidadir. Bobur prosodilar (nutqdagi urg‘uli va urg‘usiz, uzun va qisqa bo‘g‘inlar tizimi) nazariyasini o‘zining qayd etgan yangi topilmalari, holat va umumlashmalari bilan boyitdi, uning tasnif va turlarini rivojlantirdi.\n" +
                        "\n" +
                        "U o‘z qarashlarini arab, fors-tojik va turk she’riyati manbalari orqali asoslaydi. Bu orqali olim she’riyatdagi o‘zaro aloqa va hamfikrlikni ko‘rsatish bilan birga, turkiy tilda she’r yozuvchi xalqning cheksiz keng she’riy doirasini namoyon etadi. Alisher Navoiy an’analarini davom etar ekan, u xalq she’riyatiga katta e’tibor qaratgan. Uning asarlari xalq qo‘shiq san’ati janri haqidagi qimmatli ma’lumotlarni va qiziqarli etnografik materiallarni tashkil etadi.\n" +
                        "\n" +
                        "Mashhur “Boburnoma” - buyuk temuriylar tarixi (1494-1529 yillar voqealari), buyuk hokimiyat yaratilishidan so‘zlaydi. O‘zbekiston Fanlar Akademiyasi Sharqshunoslik institutida “Boburnoma”ning 10 dan ziyod qo‘lyozma nusxalari saqlanadi. Ularning barchasini taqqoslash asosida, boburshunos Porso Shamsiyev mazkur nodir asarga tanqidiy matnni (1960) nashrga tayyorladi. Keyinroq, yapon olimi I.Mano ham “Boburnoma”ga tanqidiy matnni nashr uchun tayyorladi, shuningdek, N. Ilminskiy (1847), Beverij (1905), Fitrat (lavha, 1928) va P. Shamsiyevlar (1960) tomonidan ham chop etilgan.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Uni fors (1586), golland (1705), ingliz (1826), fransuzs (1871), turk (1940) va rus (1942) tillariga tarjima qilishgan. “Boburnoma” mavzusi asosida F.A. Stil (Parij,1940), F. Grenard (Parij,1930), G. Lemb (Nyu-York,1961), V. Gaskon (Nyu-York,1980), Munila’l (6 roman) va boshqa xorij mualliflarining romanlari ham mavjud. U to‘g‘risida o‘zbek yozuchilari (Oybek, B. Boyqulov, X. Davron) tomonidan dostonlar, roman (P.Qodirov) va qissa (X.Sultonov) ham yozilgan.\n" +
                        "\n" +
                        "1521 yil “Mubayyin” nomli falsafiy-diniy asar yozilgan bo‘lib, unda islom shariatining 5 ustuni bayon etilgan, shuningdek, o‘sha yil u “Mubayyinu-l-zakot” soliq chiqimi kitobini ham yozgan. Uning “Harb ishi”, “Musiqa ilmi” kabi ilmiy asarlari hanuz topilmagan.\n" +
                        "\n" +
                        "Bobur arab grafikasi asosida “Xatti Boburiy”ni tuzgan, u turkiy fonetikaga doir. Ushbu xat asosida Qur’on hamda Boburning shaxsiy asarlari qayta yozilgan.\n" +
                        "\n" +
                        "U, shuningdek, badiiy tarjimalar bilan ham shug‘ullangan. U Bahovuddin Naqshbandiyning davomchisi, yirik so‘fi Xoji Ahror Valining “Volidiya” (Ota-onalar risolasi) diniy-falsafiy asarini she’riy ko‘rinishda tarjima qilgan.\n" +
                        "\n" +
                        "Bobur ijodini o‘rganish bo‘yicha Xalqaro ilmiy ekspeditsiya a’zolari bir necha bor shoir “izi” bo‘ylab ilmiy sayohatlar tashkil etishgan, ular tomonidan 500 dan ziyod kitob va hujjatlar topilgan bo‘lib, “Bobur va uning zamonaviy dunyodagi o‘rni” memorial muzeyida saqlanadi. Andijonda Bobur parki bo‘lib, u yerda shoirning ramziy qabri hamda “Ark ichi” memorial majmuasi joylashgan.\n" +
                        "\n" +
                        "Bobur jamoat va tarixni yuzaki kuzatuvchisi bo‘lmagan, u voqea va hodisalarni, o‘zini havotirga solgan o‘y va his-tuyg‘ularni tahlil qilishga intilgan. Bu fikrlar va hissiyotlar yaxshilik va adolat, haqiqat va go‘zallik tamoyillariga xizmat qilish uchun yo‘naltirilgan edi.\n" +
                        "\n"
            )
        )
    }


    private fun addPerson(data: FamousPersonData) {
        ls.add(data)
    }
}
