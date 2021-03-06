import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import repository.GpuRepository
import view.GpuView


@Composable
@Preview
fun OhaiApp() {
    MaterialTheme {
        GpuView(GpuRepository().models[0])
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ohai 0.1.1-alpha",
        state = WindowState(width = 400.dp, height = 550.dp),
        resizable = false,
        icon = BitmapPainter(useResource("icon/ohai_icon_512.png", ::loadImageBitmap)) // TODO: Icon looks like garbage on Windows for some reason, should fix
    ) {
        Box(modifier = Modifier.fillMaxSize().background(Color(240, 240, 240)))
        OhaiApp()
    }
}
