package com.pecapela.multitools.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pecapela.multitools.R

data object FontSizes {
    const val DISPLAY_LARGE: Int = 57
    const val DISPLAY_MEDIUM: Int = 45
    const val DISPLAY_SMALL: Int = 36
    const val HEADLINE_LARGE: Int = 32
    const val HEADLINE_MEDIUM: Int = 28
    const val HEADLINE_SMALL: Int = 24
    const val TITLE_LARGE: Int = 22
    const val TITLE_MEDIUM: Int = 16
    const val TITLE_SMALL: Int = 14
    const val BODY_LARGE: Int = 16
    const val BODY_MEDIUM: Int = 14
    const val BODY_SMALL: Int = 12
    const val LABEL_LARGE: Int = 14
    const val LABEL_MEDIUM: Int = 12
    const val LABEL_SMALL: Int = 11
}

data object LineHeights {
    const val DISPLAY_LARGE: Int = 64
    const val DISPLAY_MEDIUM: Int = 52
    const val DISPLAY_SMALL: Int = 44
    const val HEADLINE_LARGE: Int = 40
    const val HEADLINE_MEDIUM: Int = 36
    const val HEADLINE_SMALL: Int = 32
    const val TITLE_LARGE: Int = 28
    const val TITLE_MEDIUM: Int = 24
    const val TITLE_SMALL: Int = 20
    const val BODY_LARGE: Int = 24
    const val BODY_MEDIUM: Int = 20
    const val BODY_SMALL: Int = 16
    const val LABEL_LARGE: Int = 20
    const val LABEL_MEDIUM: Int = 16
    const val LABEL_SMALL: Int = 16
}

data object LetterSpacings {
    const val DISPLAY_LARGE: Float = -0.25f
    const val DISPLAY_MEDIUM: Float = 0f
    const val DISPLAY_SMALL: Float = 0f
    const val HEADLINE_LARGE: Float = 0f
    const val HEADLINE_MEDIUM: Float = 0f
    const val HEADLINE_SMALL: Float = 0f
    const val TITLE_LARGE: Float = 0f
    const val TITLE_MEDIUM: Float = 0.15f
    const val TITLE_SMALL: Float = 0.1f
    const val BODY_LARGE: Float = 0.5f
    const val BODY_MEDIUM: Float = 0.25f
    const val BODY_SMALL: Float = 0.4f
    const val LABEL_LARGE: Float = 0.1f
    const val LABEL_MEDIUM: Float = 0.5f
    const val LABEL_SMALL: Float = 0.5f
}

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.DISPLAY_LARGE.sp,
        lineHeight = LineHeights.DISPLAY_LARGE.sp,
        letterSpacing = LetterSpacings.DISPLAY_LARGE.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.DISPLAY_MEDIUM.sp,
        lineHeight = LineHeights.DISPLAY_MEDIUM.sp,
        letterSpacing = LetterSpacings.DISPLAY_MEDIUM.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.DISPLAY_SMALL.sp,
        lineHeight = LineHeights.DISPLAY_SMALL.sp,
        letterSpacing = LetterSpacings.DISPLAY_SMALL.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.HEADLINE_LARGE.sp,
        lineHeight = LineHeights.HEADLINE_LARGE.sp,
        letterSpacing = LetterSpacings.HEADLINE_LARGE.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.HEADLINE_MEDIUM.sp,
        lineHeight = LineHeights.HEADLINE_MEDIUM.sp,
        letterSpacing = LetterSpacings.HEADLINE_MEDIUM.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.HEADLINE_SMALL.sp,
        lineHeight = LineHeights.HEADLINE_SMALL.sp,
        letterSpacing = LetterSpacings.HEADLINE_SMALL.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.TITLE_LARGE.sp,
        lineHeight = LineHeights.TITLE_LARGE.sp,
        letterSpacing = LetterSpacings.TITLE_LARGE.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W500,
        fontSize = FontSizes.TITLE_MEDIUM.sp,
        lineHeight = LineHeights.TITLE_MEDIUM.sp,
        letterSpacing = LetterSpacings.TITLE_MEDIUM.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W500,
        fontSize = FontSizes.TITLE_SMALL.sp,
        lineHeight = LineHeights.TITLE_SMALL.sp,
        letterSpacing = LetterSpacings.TITLE_SMALL.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_regular)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.BODY_LARGE.sp,
        lineHeight = LineHeights.BODY_LARGE.sp,
        letterSpacing = LetterSpacings.BODY_LARGE.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_regular)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.BODY_MEDIUM.sp,
        lineHeight = LineHeights.BODY_MEDIUM.sp,
        letterSpacing = LetterSpacings.BODY_MEDIUM.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_regular)),
        fontWeight = FontWeight.W400,
        fontSize = FontSizes.BODY_SMALL.sp,
        lineHeight = LineHeights.BODY_SMALL.sp,
        letterSpacing = LetterSpacings.BODY_SMALL.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W500,
        fontSize = FontSizes.LABEL_LARGE.sp,
        lineHeight = LineHeights.LABEL_LARGE.sp,
        letterSpacing = LetterSpacings.LABEL_LARGE.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W500,
        fontSize = FontSizes.LABEL_MEDIUM.sp,
        lineHeight = LineHeights.LABEL_MEDIUM.sp,
        letterSpacing = LetterSpacings.LABEL_MEDIUM.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.W500,
        fontSize = FontSizes.LABEL_SMALL.sp,
        lineHeight = LineHeights.LABEL_SMALL.sp,
        letterSpacing = LetterSpacings.LABEL_SMALL.sp,
    )
)