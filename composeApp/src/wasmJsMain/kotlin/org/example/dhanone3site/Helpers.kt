package org.example.dhanone3site

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dhanone3site.composeapp.generated.resources.*
import dhanone3site.composeapp.generated.resources.Res
import dhanone3site.composeapp.generated.resources.hospital64
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HoverButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isHovered by interactionSource.collectIsHoveredAsState()
    val color by animateColorAsState(
        targetValue = if (isHovered) brownshade else Color.White,
        animationSpec = tween(durationMillis = 300, easing = LinearOutSlowInEasing)
    )
    Button(
        onClick,
        modifier,
        enabled,
        interactionSource = interactionSource,
        shape = RoundedCornerShape(6.dp),
        border = ButtonDefaults.outlinedBorder.copy(
            width = 2.dp,
            brush = Brush.sweepGradient(
                0.0f to color,
                1.0f to color
            ),
        ),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = if (isHovered) brownshade else Color.White,
        ),
    ) {
        Text(
            text = text,
            color = if (isHovered) Color.White else navyBlue,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
        )
    }
}

@Preview
@Composable
fun Section3Component(
    heading: String,
    description: String,
    icon: DrawableResource
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()
    val color by animateColorAsState(
        targetValue = if (isHovered) brownshade else Color.White,
        animationSpec = tween(durationMillis = 300, easing = LinearOutSlowInEasing)
    )

    Button(
        onClick = { /*TODO*/ },
        enabled = true,
        interactionSource = interactionSource,
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.width(350.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.White,
        ),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                enabled = true,
                shape = CircleShape,
                border = ButtonDefaults.outlinedBorder.copy(
                    width = 2.dp,
                    brush = Brush.sweepGradient(
                        0.0f to color,
                        1.0f to color
                    ),
                ),
                colors = ButtonDefaults.outlinedButtonColors(
                    backgroundColor = if (isHovered) brownshade else Color.White,
                ),
                modifier = Modifier.size(75.dp)
            ) {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = null,
                    tint = if (isHovered) Color.White else brownshade,
                    modifier = Modifier.size(40.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = heading,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = description,
                fontWeight = FontWeight.Normal,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(40.dp))
//            Text(
//                text = "Learn More",
//                color = brownshade,
//                fontWeight = FontWeight.SemiBold,
//                textDecoration = if (isHovered) TextDecoration.Underline else TextDecoration.None,
//            )
        }
    }
}

@Composable
fun Section5Component(
    icon: DrawableResource,
    heading: String,
    description: String
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Button(
            onClick = { /*TODO*/ },
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color.White,
            ),
            modifier = Modifier.size(75.dp),
        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = brownshade,
            )
        }
        Spacer(modifier = Modifier.width(20.dp))
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = heading,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = description,
                color = Color.Gray,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
fun LeadershipTeamComponent(
    onClick: () -> Unit,
    image: DrawableResource,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    //TODO
    val isHovered by interactionSource.collectIsHoveredAsState()
    val sizeIncreaseMultipler by animateFloatAsState(
        targetValue = if (isHovered) 1.2f else 1.0f,
        animationSpec = tween(durationMillis = 300, easing = LinearOutSlowInEasing)
    )


    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(width = 260.dp * sizeIncreaseMultipler, height = 300.dp * sizeIncreaseMultipler)
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, Color.Black, RoundedCornerShape(12.dp))
            .then(modifier),
        interactionSource = interactionSource,
        shape = RoundedCornerShape(6.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.White,
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Column(
            modifier = Modifier.size(
                width = 260.dp * sizeIncreaseMultipler,
                height = 300.dp * sizeIncreaseMultipler
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(resource = image),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
                    .height(235.dp * sizeIncreaseMultipler)
                    .clip(RoundedCornerShape(topEnd = 12.dp, topStart = 12.dp)),
                contentScale = ContentScale.FillBounds
            )
            Spacer(modifier = Modifier.height(10.dp * sizeIncreaseMultipler))
            Row(
                modifier = Modifier.fillMaxSize().padding(bottom = 10.dp * sizeIncreaseMultipler),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                // Social Media Icons Row
                Button(
                    onClick = onClick,
                    shape = CircleShape,
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color.White,
                    ),
                    modifier = Modifier.size(40.dp * sizeIncreaseMultipler).clip(CircleShape),
                    border = ButtonDefaults.outlinedBorder.copy(
                        width = 1.dp,
                        brush = Brush.sweepGradient(
                            0.0f to Color.Black,
                            1.0f to Color.Black
                        ),
                    ),
                    contentPadding = PaddingValues(0.dp)
                ){
                    Icon(
                        painter = painterResource(resource = Res.drawable.icons8_linkedin),
                        contentDescription = "linkedin",
                        modifier = Modifier.clip(CircleShape).padding(5.dp),
                        tint = Color.Black
                    )
                }
                Spacer(modifier = Modifier.width(10.dp * sizeIncreaseMultipler))
                Button(
                    onClick = onClick,
                    shape = CircleShape,
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color.White,
                    ),
                    modifier = Modifier.size(40.dp * sizeIncreaseMultipler).clip(CircleShape),
                    border = ButtonDefaults.outlinedBorder.copy(
                        width = 1.dp,
                        brush = Brush.sweepGradient(
                            0.0f to Color.Black,
                            1.0f to Color.Black
                        ),
                    ),
                    contentPadding = PaddingValues(0.dp)
                ){
                    Icon(
                        painter = painterResource(resource = Res.drawable.icons8_instagram),
                        contentDescription = "instagram",
                        modifier = Modifier.clip(CircleShape).padding(5.dp),
                        tint = Color.Black
                    )
                }
                Spacer(modifier = Modifier.width(10.dp * sizeIncreaseMultipler))
                Button(
                    onClick = onClick,
                    shape = CircleShape,
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color.White,
                    ),
                    modifier = Modifier.size(40.dp * sizeIncreaseMultipler).clip(CircleShape),
                    border = ButtonDefaults.outlinedBorder.copy(
                        width = 1.dp,
                        brush = Brush.sweepGradient(
                            0.0f to Color.Black,
                            1.0f to Color.Black
                        ),
                    ),
                    contentPadding = PaddingValues(0.dp)
                ){
                    Icon(
                        painter = painterResource(resource = Res.drawable.icons8_twitterx),
                        contentDescription = "twitterx",
                        modifier = Modifier.clip(CircleShape).padding(5.dp),
                        tint = Color.Black
                    )
                }
                Spacer(modifier = Modifier.width(10.dp * sizeIncreaseMultipler))
                Button(
                    onClick = onClick,
                    shape = CircleShape,
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color.White,
                    ),
                    modifier = Modifier.size(40.dp * sizeIncreaseMultipler).clip(CircleShape),
                    border = ButtonDefaults.outlinedBorder.copy(
                        width = 1.dp,
                        brush = Brush.sweepGradient(
                            0.0f to Color.Black,
                            1.0f to Color.Black
                        ),
                    ),
                    contentPadding = PaddingValues(0.dp)
                ){
                    Icon(
                        painter = painterResource(resource = Res.drawable.icons8_facebook),
                        contentDescription = "facebook",
                        modifier = Modifier.clip(CircleShape).padding(5.dp),
                        tint = Color.Black
                    )
                }
            }
        }
    }
}