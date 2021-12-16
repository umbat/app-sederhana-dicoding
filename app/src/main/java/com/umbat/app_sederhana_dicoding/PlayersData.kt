package com.umbat.app_sederhana_dicoding

object PlayersData {
    private val playersNames = arrayOf (
        "Wojciech Szczesny",
        "Matthijs de Ligt",
        "Leonardo Bonucci",
        "Alex Sandro",
        "Danilo",
        "Manuel Locatelli",
        "Weston McKennie",
        "Federico Chiesa",
        "Federico Bernardeschi",
        "Paulo Dybala",
        "Álvaro Morata"
    )

    private val playersDetails = arrayOf (
        "Wojciech Tomasz Szczęsny (pronounced [ˈvɔjt͡ɕɛx ˈʂt͡ʂɛ̃snɨ]; born 18 April 1990) is a Polish professional footballer who plays as a goalkeeper for Serie A club Juventus and the Poland national team",
        "Matthijs de Ligt (Dutch pronunciation: [mɑˈtɛiz də ˈlɪxt]; born 12 August 1999) is a Dutch professional footballer who plays as a centre-back for Serie A club Juventus and the Netherlands national team",
        "Leonardo Bonucci (Italian pronunciation: [leoˈnardo boˈnuttʃi]; born 1 May 1987) is an Italian professional footballer who plays as a centre-back for Serie A club Juventus and the Italy national team",
        "Alex Sandro Lobo Silva (born 26 January 1991) is a Brazilian professional footballer who plays as a left-back for Serie A club Juventus and the Brazil national team",
        "Danilo Luiz da Silva (born 15 July 1991), known as Danilo, is a Brazilian professional footballer who plays as a right-back for Serie A club Juventus and the Brazil national team",
        "Manuel Locatelli (born 8 January 1998) is an Italian professional footballer who plays as a midfielder for Serie A club Juventus, on loan from Serie A club Sassuolo, and the Italy national team",
        "Weston James Earl McKennie (born August 28, 1998) is an American professional soccer player who plays as a midfielder for Serie A club Juventus and the United States national team",
        "Federico Chiesa (Italian pronunciation: [fedeˈriːko ˈkjɛːza; ˈkjeːza]; born 25 October 1997) is an Italian professional footballer who plays as a winger for Serie A club Juventus, on loan from Fiorentina, and the Italy national team",
        "Federico Bernardeschi (Italian pronunciation: [fedeˈriːko bernarˈdeski]; born 16 February 1994) is an Italian professional footballer who plays as a winger or attacking midfielder for Serie A club Juventus and the Italy national team",
        "Paulo Exequiel Dybala (born 15 November 1993) is an Argentine professional footballer who plays as a forward for Serie A club Juventus and the Argentina national team",
        "Álvaro Borja Morata Martín (Spanish pronunciation: [ˈalβaɾo moˈɾata]; born 23 October 1992) is a Spanish professional footballer who plays as a striker for Serie A club Juventus, on loan from La Liga club Atlético Madrid, and the Spain national team"
    )

    private val playersPhoto = intArrayOf(
        R.drawable.szczesny,
        R.drawable.deligt,
        R.drawable.bonucci,
        R.drawable.danilo,
        R.drawable.alexsandro,
        R.drawable.locatelli,
        R.drawable.mckennie,
        R.drawable.chiesa,
        R.drawable.bernardeschi,
        R.drawable.dybala,
        R.drawable.morata
    )
    val listData: ArrayList<Players>
    get() {
        val list = arrayListOf<Players>()
        for (position in playersNames.indices){
            val players = Players()
            players.name = playersNames[position]
            players.detail = playersDetails[position]
            players.photo = playersPhoto[position]
            list.add(players)
        }
        return list
    }
}