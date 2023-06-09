/*
 * Copyright (c) 2023 Avesta Barzegar, York Wei, Mikail Rahman, Edward Wang
 */

package cs346.whiteboard.client.constants

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

const val FONT_PATH = "font"

val Inter = FontFamily(
    Font(resource = "$FONT_PATH/Inter-Regular.ttf",
         weight = FontWeight.Normal,
         style = FontStyle.Normal
        ),
    Font(resource = "$FONT_PATH/Inter-Medium.ttf",
        weight = FontWeight.Medium,
        style = FontStyle.Normal
    ),
    Font(resource = "$FONT_PATH/Inter-SemiBold.ttf",
        weight = FontWeight.SemiBold,
        style = FontStyle.Normal
    ),
    Font(resource = "$FONT_PATH/Inter-ExtraBold.ttf",
        weight = FontWeight.ExtraBold,
        style = FontStyle.Normal
    )
)

val Comic = FontFamily(
    Font(resource = "$FONT_PATH/Comic Sans MS.ttf",
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    )
)

val Mono = FontFamily(
    Font(resource = "$FONT_PATH/SpaceMono-Regular.ttf",
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    )
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 48.sp
    ),
    h2 = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)

val Typography.bodySmall: TextStyle
    get() = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )

fun Typography.subtitle2(scale: Float): TextStyle {
    return TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = (14 * scale).sp
    )
}

fun Typography.h2(scale: Float): TextStyle {
    return TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = (18 * scale).sp
    )
}

fun Typography.textBoxDefault(size: Float): TextStyle {
    return TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = size.sp
    )
}

fun Typography.textBoxComic(size: Float): TextStyle {
    return TextStyle(
        fontFamily = Comic,
        fontWeight = FontWeight.Medium,
        fontSize = size.sp
    )
}

fun Typography.textBoxMono(size: Float): TextStyle {
    return TextStyle(
        fontFamily = Mono,
        fontWeight = FontWeight.Medium,
        fontSize = size.sp
    )
}