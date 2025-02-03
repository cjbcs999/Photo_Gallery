package com.example.photogallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotoGalleryApp()
        }
    }
}

@Composable
fun PhotoGalleryApp() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            PhotoGalleryScreen()
        }
    }
}

@Composable
fun PhotoGalleryScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        // first row with 3 images
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            PhotoItem(
                imageRes = R.drawable.photo1,
                caption = "Nature's masterpiece: The Grand Canyon \uD83C\uDF04",
                modifier = Modifier.weight(1f)
            )
            PhotoItem(
                imageRes = R.drawable.photo2,
                caption = "Majestic views of Yosemite Valley \uD83C\uDF3F\uD83C\uDFDE\uFE0F",
                modifier = Modifier.weight(1f)
            )
            PhotoItem(
                imageRes = R.drawable.photo3,
                caption = "Iconic arches carved by time at Arches National Park \uD83C\uDFDC\uFE0F",
                modifier = Modifier.weight(1f)
            )
        }
        // space between rows
        Spacer(modifier = Modifier.height(16.dp))
        // second row with 3 images
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            PhotoItem(
                imageRes = R.drawable.photo4,
                caption = "Exploring the peaks of Rocky Mountain National Park ⛰\uFE0F\uD83C\uDF32",
                modifier = Modifier.weight(1f)
            )
            PhotoItem(
                imageRes = R.drawable.photo5,
                caption = "Towering cliffs and breathtaking views at Zion National Park \uD83C\uDFDC\uFE0F",
                modifier = Modifier.weight(1f)
            )
            PhotoItem(
                imageRes = R.drawable.photo6,
                caption = "Desert beauty and iconic Joshua trees \uD83C\uDF35✨",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun PhotoItem(imageRes: Int, caption: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = caption,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = caption, style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun PhotoGalleryScreenPreview() {
    PhotoGalleryScreen()
}

// captions are generated by AI
