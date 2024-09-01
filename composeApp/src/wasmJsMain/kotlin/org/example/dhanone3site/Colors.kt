package org.example.dhanone3site

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import dhanone3site.composeapp.generated.resources.*
import dhanone3site.composeapp.generated.resources.Res
import dhanone3site.composeapp.generated.resources.devansh
import dhanone3site.composeapp.generated.resources.dhanone3logo
import dhanone3site.composeapp.generated.resources.samarn
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.Font


val navyBlue = Color(0xFF131842)
val orange = Color(0xFFE68369)
val brownshade = Color(0xFFECCEAE)
val beige = Color(0xFFFBF6E2)

val FooterColor = Color(0xFFc8ccef)


// Font families
@Composable
fun Samarkan() = FontFamily(
    Font(
        resource = Res.font.samarn,
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    )
)

// LeadershipComponent data class

data class LeadershipComponentDataClass(
    val image: DrawableResource,
    val url: String = "https://www.google.com"
)

val LeadershipComponentDataSet = listOf(
    LeadershipComponentDataClass(Res.drawable.devansh),
    LeadershipComponentDataClass(Res.drawable.rex),
    LeadershipComponentDataClass(Res.drawable.gautham, "www.linkedin.com/in/gautham-sharma-721085323"),
    LeadershipComponentDataClass(Res.drawable.lasya),
    LeadershipComponentDataClass(Res.drawable.jishitha),
    LeadershipComponentDataClass(Res.drawable.dhanush),
    LeadershipComponentDataClass(Res.drawable.nithin),
)