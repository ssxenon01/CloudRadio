package mn.xenon.controller.mucis

import mn.xenon.domain.Music

def music = new Music(params)
music.save()

html.music {
	id music.id
	title music.title
	created music.created
}