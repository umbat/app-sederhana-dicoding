package com.umbat.app_sederhana_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Players"

        val playersData = listOf<Players>(
            Players(
                "Wojciech Szczesny",
                "Wojciech Tomasz Szczęsny",
                "Warszawa, Poland",
                "April 18, 1990",
                "Goalkeeper",
                "Wojciech Tomasz Szczęsny (pronounced [ˈvɔjt͡ɕɛx ˈʂt͡ʂɛ̃snɨ]) is a Polish professional footballer who plays as a goalkeeper for Serie A club Juventus and the Poland national team. After starting his club career at Legia Warsaw, Szczęsny signed for Arsenal in January 2006, where he made his professional debut in 2009. After a spell on loan with Brentford the following season, he later became the capital club's first choice goalkeeper, winning two FA Cups and being the joint recipient of the 2013–14 Premier League Golden Glove with Petr Čech. He subsequently went on two consecutive season-long loans to Italian club Roma in 2015, where his performances earned him a move to reigning league champions Juventus in 2017. After serving mainly as a back-up to Gianluigi Buffon in his first season, during which he won a domestic double, he inherited the starting spot from the departed Buffon the following season, winning his second Serie A title; his performances also earned him a Yashin Trophy nomination in 2019. He won a third consecutive league title the following season, also winning the Serie A Best Goalkeeper Award.",
                R.drawable.szczesny
            ),
            Players(
                "Matthijs de Ligt",
                "Matthijs de Ligt",
                "Leiderdorp, Netherlands",
                "August 12, 1999",
                "Center Back",
                "Matthijs de Ligt (Dutch pronunciation: [mɑˈtɛiz də ˈlɪxt]) is a Dutch professional footballer who plays as a centre-back for Serie A club Juventus and the Netherlands national team. On 21 September 2016, De Ligt made his debut for Ajax's senior team in a cup game against Willem II. He scored from a corner after 25 minutes, making him the second-youngest goalscorer ever behind Clarence Seedorf. On 24 May, he became the youngest player ever (17 years and 285 days old) to play in a major European final when he started against Manchester United in the 2017 UEFA Europa League Final. On 17 December 2018, De Ligt won the Golden Boy award, becoming the first defender to win the award. The following season, he helped Ajax capture a domestic double and reach the semi-finals of the Champions League; his performances earned him a move to Serie A side Juventus, and saw him win the Kopa Trophy in 2019. He won the Serie A title during his first season with the Turin side.",
                R.drawable.deligt
            ),
            Players(
                "Leonardo Bonucci",
                "Leonardo Bonucci",
                "Viterbo, Italy",
                "May 1, 1987",
                "Center Back",
                "Leonardo Bonucci (Italian pronunciation: [leoˈnardo boˈnuttʃi]) is an Italian professional footballer who plays as a centre-back for Serie A club Juventus and the Italy national team. After beginning his career with Inter Milan in 2005, Bonucci spent the next few seasons on loan at Treviso and Pisa, before moving to Bari in 2009. His technique, ball-playing ability and defensive performances alongside fellow Italian centre-back Andrea Ranocchia earned him a move to Juventus the following season, where he later became a key member of the club's three-man defensive line, alongside Giorgio Chiellini and Andrea Barzagli, establishing himself as one of the best defenders in world football. Among other titles, he went on to win six consecutive Serie A titles with the team between 2012 and 2017, having also played two UEFA Champions League finals in 2015 and 2017. In 2017, he moved to AC Milan, and one season later returned to Juventus, winning two more consecutive league titles.",
                R.drawable.bonucci
            ),
            Players(
                "Alex Sandro",
                "Alex Sandro Lobo Silva",
                "Catanduva, Brazil",
                "January 26, 1991",
                "Left Wing Back",
                "Alex Sandro Lobo Silva is a Brazilian professional footballer who plays as a left-back for Serie A club Juventus and the Brazil national team. At club level, Alex Sandro began his career with Atletico Paranaense, and later also played for Santos on loan. In 2011, he joined Porto for €9.6 million, alongside teammate and countryman Danilo, who plays as a right back. He joined Juventus in 2015, winning the domestic double in his first three seasons, followed by two more consecutive league titles over the following two years.",
                R.drawable.alexsandro
            ),
            Players(
                "Danilo",
                "Danilo Luiz da Silva",
                "Bicas, Brazil",
                "July 15, 1991",
                "Right Wing Back",
                "Danilo Luiz da Silva known as Danilo, is a Brazilian professional footballer who plays as a right-back for Serie A club Juventus and the Brazil national team. Danilo began his career with América Mineiro before moving to Santos, where he scored the goal that won the 2011 Copa Libertadores. In January 2012, he moved to Portuguese club Porto, where he won consecutive Primeira Liga titles. In 2015, he joined Real Madrid following a €31.5 million transfer fee. In 2017, he joined Manchester City. In 2019, having won two Premier League titles, an FA Cup and two EFL Cups with City, Danilo joined Juventus, winning the Serie A title during his first season with the club.",
                R.drawable.danilo
            ),
            Players(
                "Manuel Locatelli",
                "Manuel Locatelli",
                "Bicas, Brazil",
                "January 8, 1998",
                "Midfielder",
                "Manuel Locatelli is an Italian professional footballer who plays as a midfielder for Serie A club Juventus, on loan from Serie A club Sassuolo, and the Italy national team. After coming through the club's youth system, Locatelli made his professional debut with AC Milan, helping them win the 2016 Supercoppa Italiana. He moved to Sassuolo in 2018, before joining Juventus in 2021. Locatelli represented Italy internationally, participating in Italy's victorious UEFA Euro 2020 campaign.",
                R.drawable.locatelli
            ),
            Players(
                "Weston McKennie",
                "Weston James Earl McKennie",
                "Little Elm, Texas, USA",
                "August 28, 1998",
                "Midfielder",
                "Weston James Earl McKennie (born ) is an American professional soccer player who plays as a midfielder for Serie A club Juventus and the United States national team. Coming through the youth system, McKennie began his senior club career at Bundesliga side Schalke 04. In 2017–18, he established himself as a first team player, playing 25 games in all competitions. After three seasons, McKennie moved to Italian champions Juventus on loan, with the deal becoming permanent in March 2021.",
                R.drawable.mckennie
            ),
            Players(
                "Federico Chiesa",
                "Federico Chiesa",
                "Genova, Italy",
                "October 25, 1997",
                "Right Winger",
                "Federico Chiesa (Italian pronunciation: [fedeˈriːko ˈkjɛːza; ˈkjeːza]) is an Italian professional footballer who plays as a winger for Serie A club Juventus, on loan from Fiorentina, and the Italy national team. He is the son of former footballer Enrico Chiesa. Chiesa began his youth career with Settignanese from Settignano, a frazione northeast of Florence, where he was coached by Fiorentina legend Kurt Hamrin. He joined Fiorentina in 2007. He made his competitive debut for Fiorentina in a 2–1 away defeat against Juventus, during the opening fixture of the 2016–17 Serie A season. On 16 September 2017, in the 2017–18 season, Chiesa marked his 30th league appearance for Fiorentina with a goal in the Derby dell'Appennino against Bologna. On 5 October 2020, Chiesa signed a two-year loan deal with Juventus; a €3 million loan for the first season and a €7 million loan for the second season, with a conditional obligation to buy for €40 million plus €10 million in variables.",
                R.drawable.chiesa
            ),
            Players(
                "Federico Bernardeschi",
                "Federico Bernardeschi",
                "Carrara, Italy",
                "February 16, 1994",
                "Left Winger",
                "Federico Bernardeschi (Italian pronunciation: [fedeˈriːko bernarˈdeski]) is an Italian professional footballer who plays as a winger or attacking midfielder for Serie A club Juventus and the Italy national team. Bernardeschi began his playing career with Atletico Carrara and Polisportiva Ponzano. In 2003, he moved to the Fiorentina youth system, where he spent 10 years, before spending one season on loan at Crotone during the 2013–14 season. He returned to Fiorentina the following season. In July 2017, he was sold to Juventus, where he has since won three consecutive Serie A titles, among other trophies.",
                R.drawable.bernardeschi
            ),
            Players(
                "Paulo Dybala",
                "Paulo Bruno Exequiel Dybala",
                "Laguna Larga, Argentine",
                "November 15, 1993",
                "Second Striker",
                "Paulo Exequiel Dybala is an Argentine professional footballer who plays as a forward for Serie A club Juventus and the Argentina national team. Nicknamed \"La Joya\" (\"The Jewel\"),[4] Dybala began his senior club career in 2011 playing for Instituto de Córdoba, before signing for Palermo in 2012, at age 18, where he won a Serie B title. In 2015, Dybala signed for Juventus and won five league titles and four Coppas Italia. He was also voted Serie A Most Valuable Player once, was also included in the Serie A Team of the Year four times, and ranks as Juventus' eleventh-highest all-time goalscorer.",
                R.drawable.dybala
            ),
            Players(
                "Álvaro Morata",
                "Álvaro Borja Morata Martín",
                "Madrid, Spain",
                "October 23, 1992",
                "Striker",
                "Álvaro Borja Morata Martín (Spanish pronunciation: [ˈalβaɾo moˈɾata]) is a Spanish professional footballer who plays as a striker for Serie A club Juventus, on loan from La Liga club Atlético Madrid, and the Spain national team. He began his career at Real Madrid, making his debut with the senior team in late 2010. After winning the 2013–14 UEFA Champions League, he moved to Juventus for €20 million in 2014, winning the double of Serie A and the Coppa Italia in both of his seasons in Turin. After being bought back by Real for €30 million, he won another La Liga and the UEFA Champions League in 2016–17 before joining Chelsea in 2017 for a club record fee of around £60 million. In January 2019, he moved to Atlético Madrid on loan and joined the club permanently on 1 July 2020. Morata moved back to Juventus on loan in 2020.",
                R.drawable.morata
            )
        )

        val rvPlayers = findViewById<RecyclerView>(R.id.rv_players)
        val adapter = ListPlayerAdapter(playersData){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PLAYERS, it)
            startActivity(intent)
        }


        rvPlayers.layoutManager = GridLayoutManager(this, 2)
        rvPlayers.setHasFixedSize(true)
        rvPlayers.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_profil, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}