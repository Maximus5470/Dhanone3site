package org.example.dhanone3site

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dhanone3site.composeapp.generated.resources.*
import dhanone3site.composeapp.generated.resources.Res
import dhanone3site.composeapp.generated.resources.barchart64
import dhanone3site.composeapp.generated.resources.database100
import dhanone3site.composeapp.generated.resources.linechart
import kotlinx.browser.window
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

val screenWidth = window.screen.width
val screenHeight = window.screen.height

@Composable
fun NavigationBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val annotatedString = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.White)) {
                append("Dhanone")
            }
            withStyle(style = SpanStyle(color = orange)) {
                append("3 AI")
            }
        }
        Text(text = annotatedString, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Row(horizontalArrangement = Arrangement.spacedBy(40.dp)) {
            Text("Home", color = Color.White, fontSize = 16.sp)
            Text("About Us", color = Color.White, fontSize = 16.sp)
            Text("Solutions", color = Color.White, fontSize = 16.sp)
            Text("Memoir", color = Color.White, fontSize = 16.sp)
            Text("Company", color = Color.White, fontSize = 16.sp)
        }
        Button(
            onClick = { TODO() },
            modifier = Modifier.padding(horizontal = 40.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = orange)
        ) {
            Text("Contact Us", color = Color.White, modifier = Modifier.padding(horizontal = 20.dp))
        }
    }
}

@Composable
fun OpenMessage() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.width(700.dp)
    ) {
        Text(
            text = "Data-Driven AI for Radiological Excellence",
            color = Color.White,
            fontSize = MaterialTheme.typography.h2.fontSize,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "At Dhanone3 AI, we leverage vast datasets and advanced algorithms to revolutionize radiology. Our AI-driven solutions provide precise diagnostics, predictive analytics, and enhanced patient care through the power of data.",
            color = Color.White,
            fontSize = MaterialTheme.typography.body1.fontSize,
            fontWeight = MaterialTheme.typography.body1.fontWeight,
            modifier = Modifier.width(700.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = orange),
        ) {
            Text("Explore Our Solutions", color = Color.White, modifier = Modifier.padding(horizontal = 20.dp))
        }
    }
}

@Composable
fun Section2() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.width(600.dp)
        ) {
            Text(
                text = "Our Data-Centric Solutions",
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Dhanone3 AI harnesses the power of big data to deliver transformative AI solutions for radiology. Our services are designed to improve diagnostic accuracy and efficiency by utilizing comprehensive datasets.",
                fontSize = MaterialTheme.typography.body1.fontSize,
                color = Color.Gray,
            )
        }
        HoverButton(
            onClick = { /* TODO */ },
            text = "Request a Meet",
        )
    }
}

@Composable
fun Section3() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Section3Component(
            heading = "AI-Driven Diagnostics",
            description = "Our AI algorithms provide precise and efficient diagnostics for a wide range of medical imaging modalities.",
            icon = Res.drawable.database100
        )
        Section3Component(
            heading = "Data-Enhanced Workflows",
            description = "Optimize radiology workflows with AI tools that are powered by real-time data analysis, reducing errors and improving outcomes.",
            icon = Res.drawable.barchart64
        )
        Section3Component(
            heading = "Predictive Analytics",
            description = "Utilize AI-driven predictive analytics based on large datasets to anticipate patient outcomes and enhance proactive care.",
            icon = Res.drawable.linechart
        )
    }
}

@Composable
fun Section4() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.width(550.dp)
        ) {
            Text(
                text = "About Dhanone3 AI",
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Dhanone3 AI is a leader in the integration of big data and artificial intelligence within the radiology field. Our mission is to provide healthcare professionals with data-driven tools that enhance diagnostic accuracy and improve patient outcomes.\n",
                fontSize = MaterialTheme.typography.body1.fontSize,
                color = Color.Gray,
            )
            Text(
                text = "We believe that data is the key to transforming healthcare. Our AI solutions are built on comprehensive datasets, designed to empower radiologists with the insights they need to make informed decisions.\n",
                fontSize = MaterialTheme.typography.body1.fontSize,
                color = Color.Gray,
            )
            Text(
                text = "Explore how Dhanone3 AI is using data to drive innovation in radiology and improve patient care.",
                fontSize = MaterialTheme.typography.body1.fontSize,
                color = Color.Gray,
            )
        }
        Image(
            painter = painterResource(resource = Res.drawable.dhanone3logo),
            contentDescription = "Dhanone3 AI Logo",
            modifier = Modifier.size(400.dp)
        )
    }
}

@Composable
fun Section5() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(resource = Res.drawable.badassXray),
            contentDescription = "Xray",
            modifier = Modifier.size(450.dp)
        )
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.width(500.dp)
        ) {
            Text(
                text = "Why Choose Dhanone3 AI",
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "We combine advanced AI technology with extensive datasets to provide the most accurate and reliable radiological solutions available today.",
                fontSize = MaterialTheme.typography.body1.fontSize,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.height(40.dp))
            Section5Component(
                icon = Res.drawable.heart_with_pulse64,
                heading = "Data-Driven Accuracy",
                description = "Our AI models are trained on millions of data points, ensuring unmatched accuracy in diagnostics."
            )
            Spacer(modifier = Modifier.height(20.dp))
            Section5Component(
                icon = Res.drawable.truck50,
                heading = "Seamless Integration",
                description = "Integrate our AI solutions seamlessly into existing systems, leveraging data for improved workflow efficiency."
            )
            Spacer(modifier = Modifier.height(20.dp))
            Section5Component(
                icon = Res.drawable.hospital64,
                heading = "Predictive Power",
                description = "Utilize predictive analytics driven by big data to foresee patient outcomes and plan proactive interventions."
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LeadershipTeam() {
    val pagerState = rememberPagerState(pageCount = { LeadershipComponentDataSet.size }, initialPage = 0)
    //TODO
    Row(
        modifier = Modifier.fillMaxWidth()
            .background(color = beige),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth().background(beige),
            pageSize = PageSize.Fixed(250.dp * 1.2f),
            pageSpacing = 10.dp,
            contentPadding = PaddingValues(10.dp),
            beyondBoundsPageCount = 1,
        ) { item ->
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                LeadershipTeamComponent(image = LeadershipComponentDataSet[item].image, onClick = { window.open(LeadershipComponentDataSet[item].url, "_blank") })
            }
        }
    }
}

@Composable
fun Footer() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .width(800.dp)
            .background(FooterColor)
            .padding(20.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.width(300.dp)
        ) {
            val annotatedString = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0xFF131842))) {
                    append("Dhanone")
                }
                withStyle(style = SpanStyle(color = Color(0xFFE68369))) {
                    append("3 AI")
                }
            }
            Text(text = annotatedString, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(10.dp))
            Text("At Dhanone3 AI, we are committed to leveraging big data to revolutionize radiology. Our AI solutions empower healthcare professionals with the tools they need to deliver accurate, data-driven diagnostics and improve patient outcomes.")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Trust Dhanone3 AI to provide the data-driven insights that will shape the future of radiology.")
        }
        Column {
            Text("About Us", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = navyBlue)
            Spacer(modifier = Modifier.height(20.dp))
            Text("Home")
            Spacer(modifier = Modifier.height(10.dp))
            Text("About Us")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Work with Us")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Our Blog")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Terms & Conditions")
        }
//        Column {
//            Text("Solutions", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Turquoise1)
//            Spacer(modifier = Modifier.height(20.dp))
//            Text("AI Diagnostics")
//            Spacer(modifier = Modifier.height(10.dp))
//            Text("Data Enhanced Workflows")
//            Spacer(modifier = Modifier.height(10.dp))
//            Text("Predictive Analysis")
//        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxWidth()
            .verticalScroll(rememberScrollState()),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .background(color = navyBlue)
                .padding(start = 150.dp, end = 150.dp, top = 20.dp, bottom = 60.dp),
            horizontalAlignment = Alignment.Start,
            //4ac1a9   49bfa8 (Gradient)
        ) {
            // First section of the website
            NavigationBar()
            Spacer(modifier = Modifier.height(100.dp))
            OpenMessage()
        }
        // Second section of the website
        Column(
            modifier = Modifier.fillMaxWidth()
                .background(color = beige)
                .padding(start = 150.dp, end = 150.dp, top = 80.dp, bottom = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Section2()
            Spacer(modifier = Modifier.height(75.dp))
            Section3()
            Spacer(modifier = Modifier.height(75.dp))
            Section4()
            Spacer(modifier = Modifier.height(75.dp))
            Section5()
            Spacer(modifier = Modifier.height(75.dp))
            Text(
                "Leadership Team",
                color = navyBlue,
                fontSize = MaterialTheme.typography.h2.fontSize,
                fontWeight = FontWeight.ExtraBold
            )
        }
        LeadershipTeam()
        Spacer(modifier = Modifier.height(30.dp).background(color = beige))
        Column(
            modifier = Modifier.fillMaxWidth()
                .background(color = FooterColor)
                .padding(start = 150.dp, end = 150.dp, top = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Footer()
            Spacer(modifier = Modifier.height(20.dp))
        }
        Column(
            modifier = Modifier.fillMaxWidth()
                .background(color = FooterColor)
                .padding(start = 140.dp, end = 140.dp, top = 20.dp, bottom = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                "\"Namani Dhanwanthary Aadi Devam, Surasura Vanditham Pada Padmam, Loke Jara Rugbhay Mrityu Nashakam, Datharam Eesham Vividhaushadhinam\"",
                color = orange,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 26.sp,
                textAlign = TextAlign.Center,
                fontFamily = Samarkan()
            )
        }
    }
}
