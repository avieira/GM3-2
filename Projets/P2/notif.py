#!/usr/bin/env python2
import os,subprocess,pynotify,pyinotify
from gobject import GError

def auto_compile(path):
	wm = pyinotify.WatchManager()
	notifier = pyinotify.Notifier(wm)
	wm.add_watch(path, pyinotify.IN_CLOSE_WRITE,onSave)
	notifier.loop()
	
def onSave(event):
	if event.name == "dossierP2.tex":
		pynotify.init("Mon appli python")
		try:
			subprocess.check_call(['pdflatex', '-halt-on-error' ,'dossierP2.tex'])
		except subprocess.CalledProcessError:
			message = pynotify.Notification("Build failed.")
		else:
			message = pynotify.Notification("Build done.")
		try:
			message.show()
		except GError:
			print('Gerror')

def main():
	auto_compile(os.getcwd())

if __name__ == '__main__':
    main()


