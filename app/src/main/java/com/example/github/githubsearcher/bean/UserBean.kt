package com.example.github.githubsearcher.bean

import java.util.*

/**
 * login: "mojombo",
id: 1,
node_id: "MDQ6VXNlcjE=",
avatar_url: "https://avatars0.githubusercontent.com/u/1?v=4",
gravatar_id: "",
url: "https://api.github.com/users/mojombo",
html_url: "https://github.com/mojombo",
followers_url: "https://api.github.com/users/mojombo/followers",
following_url: "https://api.github.com/users/mojombo/following{/other_user}",
gists_url: "https://api.github.com/users/mojombo/gists{/gist_id}",
starred_url: "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
subscriptions_url: "https://api.github.com/users/mojombo/subscriptions",
organizations_url: "https://api.github.com/users/mojombo/orgs",
repos_url: "https://api.github.com/users/mojombo/repos",
events_url: "https://api.github.com/users/mojombo/events{/privacy}",
received_events_url: "https://api.github.com/users/mojombo/received_events",
type: "User",
site_admin: false,
name: "Tom Preston-Werner",
company: null,
blog: "http://tom.preston-werner.com",
location: "San Francisco",
email: null,
hireable: null,
bio: null,
public_repos: 61,
public_gists: 62,
followers: 21724,
following: 11,
created_at: "2007-10-20T05:24:19Z",
updated_at: "2019-12-10T01:37:51Z"
 */
data class UserBean(
    var name :String,
    var email : String,
    var location :String,
    var created_at : Date,
    var followers: Long,
    var following : Long,
    var login :String,
    var avatar_url : String,
    var repos_url : String,
    var full_name : String
)