package com.example.famousperson11.data.repository

import android.content.Context
import com.example.famousperson11.data.model.QuestionData

class QuestionRepository(private val context: Context) {
    private val questions = ArrayList<QuestionData>()

    init {
        loadList()
    }

    private fun loadList() {

        //Alisher Navoiy

        addQuestion(
            QuestionData(
                famousID = 0,
                id = 0,
                questionText = "Alisher Navoiy qachon tug`ilgan?",
                variantA = "1442",
                variantB = "1501",
                variantC = "1441",
                variantD = "1336",
                correctAnswer = "1441"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 0,
                id = 1,
                questionText = "Alisher Navoiy qayerda tugilgan?",
                variantA = "Hirotda",
                variantB = "Bobilda",
                variantC = "Samarqandda",
                variantD = "Kobulda",
                correctAnswer = "Hirotda"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 0,
                id = 2,
                questionText = "Alisher Navoiyning to'liq ismi nima?",
                variantA = "Mir Alisher Navoiy",
                variantB = "Nizomiddin Mir Alisher Navoiy",
                variantC = "Nizomiddin Mir Alisher Foniy",
                variantD = "Nizomiddin Mir Alisher",
                correctAnswer = "Nizomiddin Mir Alisher"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 0,
                id = 3,
                questionText = "Alisher Navoiy necha yoshdan sher yozib boshlaydi?",
                variantA = "10-12",
                variantB = "12-13",
                variantC = "14-16",
                variantD = "8-10",
                correctAnswer = "10-12"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 0,
                id = 4,
                questionText = "Alisher Navoiyning ijodi ulkan. Olti dostonining hajmi .... ga yaqin misrani tashkil etadi.",
                variantA = "60 000",
                variantB = "50 000",
                variantC = "40 000",
                variantD = "70 000",
                correctAnswer = "60 000"
            )
        )

        //Amir Temur

        addQuestion(
            QuestionData(
                famousID = 1,
                id = 0,
                questionText = "Amir Temur qachon tug`ilgan?",
                variantA = "1442",
                variantB = "1501",
                variantC = "1441",
                variantD = "1336",
                correctAnswer = "1336"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 1,
                id = 1,
                questionText = "Amir Temur qayerda tugilgan?",
                variantA = "Hirotda",
                variantB = "Bobilda",
                variantC = "Samarqandda",
                variantD = "Keshda",
                correctAnswer = "Keshda"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 1,
                id = 2,
                questionText = "Amir Temurning otasining ismi nima?",
                variantA = "Amir Muhammad Tarag'ay",
                variantB = "Muhammad",
                variantC = "Amir Tarag'ay",
                variantD = "Amir Husayn",
                correctAnswer = "Amir Muhammad Tarag'ay"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 1,
                id = 3,
                questionText = "Amir Temurning Birinchi ikkita o'g'li qachon tug'iladi?",
                variantA = "1336",
                variantB = "1356",
                variantC = "1350",
                variantD = "1357",
                correctAnswer = "1356"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 1,
                id = 4,
                questionText = "Amir Temur ....-yil Xitoyga yurishi vaqtida O‘tror shahrida vafot etgan.",
                variantA = "1405",
                variantB = "1404",
                variantC = "1406",
                variantD = "1407",
                correctAnswer = "1405"
            )
        )

        //Mirzo Ulug'bek

        addQuestion(
            QuestionData(
                famousID = 2,
                id = 0,
                questionText = "Mirzo Ulug'bek qachon tug`ilgan?",
                variantA = "1394",
                variantB = "1398",
                variantC = "1396",
                variantD = "1395",
                correctAnswer = "1394"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 2,
                id = 1,
                questionText = "Mirzo Ulug'bek qayerda tugilgan?",
                variantA = "Eronda",
                variantB = "Sultoniyada",
                variantC = "Samarqandda",
                variantD = "Keshda",
                correctAnswer = "Sultoniyada"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 2,
                id = 2,
                questionText = "Mirzo Ulug'bekning toliq ismi nima?",
                variantA = "Mirzo Muhammad ibn Shohruh ibn Temur Ulug'bek Qo'rag'oniy",
                variantB = "Mirzo Ulug'bek",
                variantC = "Ulug'bek",
                variantD = "Amir Ulug'bek",
                correctAnswer = "Mirzo Muhammad ibn Shohruh ibn Temur Ulug'bek Qo'rag'oniy"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 2,
                id = 3,
                questionText = "Mirzo ulug'bek nechta yulduzning joylashuvini aniqlagan?",
                variantA = "1018",
                variantB = "1015",
                variantC = "1019",
                variantD = "1017",
                correctAnswer = "1018"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 2,
                id = 4,
                questionText = ".... yil Makkaga safari chog‘i Ulug‘bek shariat qaroriga muvofiq, xoinona o‘ldiriladi.",
                variantA = "1449",
                variantB = "1448",
                variantC = "1450",
                variantD = "1447",
                correctAnswer = "1449"
            )
        )

        //Zahiriddin Muhammad Bobur

        addQuestion(
            QuestionData(
                famousID = 3,
                id = 0,
                questionText = "Bobur Mirzo qachon tug`ilgan?",
                variantA = "1483",
                variantB = "1480",
                variantC = "1383",
                variantD = "1380",
                correctAnswer = "1483"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 3,
                id = 1,
                questionText = "Bobur Mirzo qayerda tugilgan?",
                variantA = "Andijonda",
                variantB = "Sultoniyada",
                variantC = "Samarqandda",
                variantD = "Keshda",
                correctAnswer = "Andijonda"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 3,
                id = 2,
                questionText = "Bobur Mirzo qachon Hindistonda Boburiylar davlatiga asos soladi?",
                variantA = "1526",
                variantB = "1527",
                variantC = "1530",
                variantD = "1531",
                correctAnswer = "1526"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 3,
                id = 3,
                questionText = "U sharq nasriy janrlarida .... dan ziyod she’rlar yozgan.",
                variantA = "10",
                variantB = "15",
                variantC = "7",
                variantD = "25",
                correctAnswer = "10"
            )
        )
        addQuestion(
            QuestionData(
                famousID = 3,
                id = 4,
                questionText = "Bobur Mirzo qachon vafot etadi?",
                variantA = "1539",
                variantB = "1540",
                variantC = "1537",
                variantD = "1538",
                correctAnswer = "1539"
            )
        )

    }

    fun getList(famousID: Int): List<QuestionData> {
        val newList = questions.filter { item ->
            item.famousID == famousID
        }
        return newList
    }

    private fun addQuestion(data: QuestionData) {
        questions.add(data)
    }
}