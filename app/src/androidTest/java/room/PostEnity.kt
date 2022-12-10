package room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Post")
data class PostEntity(
    @PrimaryKey(autoGenerate = false) var id: Int,
    var userId: Int,
    var title: String,
    var body: String
)