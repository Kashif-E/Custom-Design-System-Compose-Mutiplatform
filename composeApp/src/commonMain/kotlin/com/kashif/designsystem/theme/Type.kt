package com.kashif.designsystem.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kashif.designsystem.theme.colors.LocalAppColors
import customdesignsystem.composeapp.generated.resources.Res
import customdesignsystem.composeapp.generated.resources.nunito
import org.jetbrains.compose.resources.Font


/** Object that holds the custom typography for the Compose theme. */
object Type {
    /**
     * Provides the custom [Typography] for the Compose theme.
     *
     * The [Typography] object contains different text styles for various text elements in the theme.
     * Each text style is defined with a specific [FontFamily], [FontWeight], and [fontSize].
     *
     * @return The custom [Typography] for the theme.
     */
    val typography: Typography
        @Composable
        get() {
            return CustomTypography()
        }

    /**
     * Composable function that creates and returns the custom [Typography].
     *
     * @return The custom [Typography] instance.
     */
    @Composable
    private fun CustomTypography(): Typography {


        val nunitoRegular =
            FontFamily(Font(Res.font.nunito, weight = FontWeight.Normal))
        val nunitoSemiBold =
            FontFamily(Font(Res.font.nunito, weight = FontWeight.SemiBold))
        val nunitoBold =
            FontFamily(Font(Res.font.nunito, weight = FontWeight.Bold))

        val typo =
            Typography(
                h1 =
                TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    color = LocalAppColors.current.onSurface
                ),
                h2 = TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = LocalAppColors.current.onSurface
                ),
                h3 =
                TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = LocalAppColors.current.onSurface
                ),
                h4 =
                TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = LocalAppColors.current.onSurface
                ),
                h5 = TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = LocalAppColors.current.onSurface
                ),
                h6 =
                TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = LocalAppColors.current.onSurface
                ),
                subtitle1 =
                TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = LocalAppColors.current.onSurface
                ),
                subtitle2 =
                TextStyle(
                    fontFamily = nunitoRegular,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = LocalAppColors.current.onSurface
                ),
                body1 =
                TextStyle(
                    fontFamily = nunitoRegular,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    color = LocalAppColors.current.onSurface
                ),
                body2 = TextStyle(
                    fontFamily = nunitoRegular,
                    fontSize = 12.sp,
                    color = LocalAppColors.current.onSurface
                ),
                button =
                TextStyle(
                    fontFamily = nunitoRegular,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = LocalAppColors.current.onPrimary
                ),
                caption =
                TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = LocalAppColors.current.onSurface
                ),
                overline =
                TextStyle(
                    fontFamily = nunitoBold,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = LocalAppColors.current.onSurface
                )
            )

        return typo
    }
}
