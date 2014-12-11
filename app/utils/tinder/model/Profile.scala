package utils.tinder.model

import scala.annotation.meta.field
import com.fasterxml.jackson.annotation._
import com.fasterxml.jackson.databind.annotation._


/**
 * Represents a profile of another user.
 * @param _id
 * @param bio
 * @param birth_date
 * @param birth_date_info
 * @param common_friend_count
 * @param common_friends
 * @param common_like_count
 * @param common_likes
 * @param distance_mi
 * @param gender
 * @param name
 * @param photos
 * @param ping_time
 * @param id
 */
@JsonIgnoreProperties(ignoreUnknown=true)
case class Profile(
  @(JsonProperty@field)("_id")
  _id: String,

  @(JsonProperty@field)("id")
  id: String,

  @(JsonProperty@field)("bio")
  bio: String,

  @(JsonProperty@field)("birth_date")
  birth_date: String,

  @(JsonProperty@field)("birth_date_info")
  birth_date_info: String,

  @(JsonProperty@field)("common_friend_count")
  common_friend_count: Int,

  @(JsonProperty@field)("common_friends")
  common_friends: List[Map[String, String]],

  @(JsonProperty@field)("common_like_count")
  common_like_count: Int,

  @(JsonProperty@field)("common_likes")
  common_likes: List[String],

  @(JsonProperty@field)("distance_mi")
  distance_mi: Int,

  @(JsonProperty@field)("gender")
  gender: Int,

  @(JsonProperty@field)("name")
  name: String,

  @(JsonProperty@field)("photos")
  photos: List[Photo],

  @(JsonProperty@field)("ping_time")
  ping_time: String
) {
  /**
   * necessary for object instantiation
   */
  def this() = this("","","","","",0,List(Map(""->"")),0,List(""),0,0,"",List(new Photo()),"")
}
