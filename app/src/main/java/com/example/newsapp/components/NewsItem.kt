package com.example.newsapp.components

data class NewsItem(
    val title: String,
    val image : String
)

val news = listOf(
    NewsItem("Retrato presidencial de Donald Trump", "https://imgs.search.brave.com/YCDCvLa65HXHtinJYK8yPVUyc4vlB1wZrPgxA004pA0/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9yZW5k/ZXIuZmluZWFydGFt/ZXJpY2EuY29tL2lt/YWdlcy9pbWFnZXMt/cHJvZmlsZS1mbG93/LzQwMC9pbWFnZXMv/YXJ0d29ya2ltYWdl/cy9tZWRpdW1sYXJn/ZS8yL2RvbmFsZC10/cnVtcC1zcGVha3Mt/dG8tZ29wLXdvbWVu/cy1ncm91cHMtZGF2/aWQtYmVja2VyLmpw/Zw"),
    NewsItem("Cleopatra", "https://oem.com.mx/diariodequeretaro/img/18751754/1664355593/BASE_LANDSCAPE/1200/Cleopatra.jpg"),
    NewsItem("Riesgos de seguridad en IA", "https://www.tarlogic.com/wp-content/uploads/2023/09/riesgos-seguridad-IA-3.jpg"),
    NewsItem("Imagen de La Tercera", "https://www.latercera.com/resizer/v2/RO76QH6WSBGDVFFFDRBML6WNBI.jpg?quality=80&smart=true&auth=af0b60c72624f0449cef3e81bf71374fb3b872d76ff9a0597ac669006190de63&width=1200&height=750")
)
