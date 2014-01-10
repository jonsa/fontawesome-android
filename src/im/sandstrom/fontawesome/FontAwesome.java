/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 Jonas Sandström
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package im.sandstrom.fontawesome;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

/**
 * @author Jonas Sandström
 */
public enum FontAwesome {
	ADJUST('\uf042'),
	ADN('\uf170'),
	ALIGN_CENTER('\uf037'),
	ALIGN_JUSTIFY('\uf039'),
	ALIGN_LEFT('\uf036'),
	ALIGN_RIGHT('\uf038'),
	AMBULANCE('\uf0f9'),
	ANCHOR('\uf13d'),
	ANDROID('\uf17b'),
	ANGLE_DOUBLE_DOWN('\uf103'),
	ANGLE_DOUBLE_LEFT('\uf100'),
	ANGLE_DOUBLE_RIGHT('\uf101'),
	ANGLE_DOUBLE_UP('\uf102'),
	ANGLE_DOWN('\uf107'),
	ANGLE_LEFT('\uf104'),
	ANGLE_RIGHT('\uf105'),
	ANGLE_UP('\uf106'),
	APPLE('\uf179'),
	ARCHIVE('\uf187'),
	ARROW_CIRCLE_DOWN('\uf0ab'),
	ARROW_CIRCLE_LEFT('\uf0a8'),
	ARROW_CIRCLE_O_DOWN('\uf01a'),
	ARROW_CIRCLE_O_LEFT('\uf190'),
	ARROW_CIRCLE_O_RIGHT('\uf18e'),
	ARROW_CIRCLE_O_UP('\uf01b'),
	ARROW_CIRCLE_RIGHT('\uf0a9'),
	ARROW_CIRCLE_UP('\uf0aa'),
	ARROW_DOWN('\uf063'),
	ARROW_LEFT('\uf060'),
	ARROW_RIGHT('\uf061'),
	ARROW_UP('\uf062'),
	ARROWS('\uf047'),
	ARROWS_ALT('\uf0b2'),
	ARROWS_H('\uf07e'),
	ARROWS_V('\uf07d'),
	ASTERISK('\uf069'),
	BACKWARD('\uf04a'),
	BAN('\uf05e'),
	BAR_CHART_O('\uf080'),
	BARCODE('\uf02a'),
	BARS('\uf0c9'),
	BEER('\uf0fc'),
	BELL('\uf0f3'),
	BELL_O('\uf0a2'),
	BITBUCKET('\uf171'),
	BITBUCKET_SQUARE('\uf172'),
	BOLD('\uf032'),
	BOLT('\uf0e7'),
	BOOK('\uf02d'),
	BOOKMARK('\uf02e'),
	BOOKMARK_O('\uf097'),
	BRIEFCASE('\uf0b1'),
	BTC('\uf15a'),
	BUG('\uf188'),
	BUILDING_O('\uf0f7'),
	BULLHORN('\uf0a1'),
	BULLSEYE('\uf140'),
	CALENDAR('\uf073'),
	CALENDAR_O('\uf133'),
	CAMERA('\uf030'),
	CAMERA_RETRO('\uf083'),
	CARET_DOWN('\uf0d7'),
	CARET_LEFT('\uf0d9'),
	CARET_RIGHT('\uf0da'),
	CARET_SQUARE_O_DOWN('\uf150'),
	CARET_SQUARE_O_LEFT('\uf191'),
	CARET_SQUARE_O_RIGHT('\uf152'),
	CARET_SQUARE_O_UP('\uf151'),
	CARET_UP('\uf0d8'),
	CERTIFICATE('\uf0a3'),
	CHAIN_BROKEN('\uf127'),
	CHECK('\uf00c'),
	CHECK_CIRCLE('\uf058'),
	CHECK_CIRCLE_O('\uf05d'),
	CHECK_SQUARE('\uf14a'),
	CHECK_SQUARE_O('\uf046'),
	CHEVRON_CIRCLE_DOWN('\uf13a'),
	CHEVRON_CIRCLE_LEFT('\uf137'),
	CHEVRON_CIRCLE_RIGHT('\uf138'),
	CHEVRON_CIRCLE_UP('\uf139'),
	CHEVRON_DOWN('\uf078'),
	CHEVRON_LEFT('\uf053'),
	CHEVRON_RIGHT('\uf054'),
	CHEVRON_UP('\uf077'),
	CIRCLE('\uf111'),
	CIRCLE_O('\uf10c'),
	CLIPBOARD('\uf0ea'),
	CLOCK_O('\uf017'),
	CLOUD('\uf0c2'),
	CLOUD_DOWNLOAD('\uf0ed'),
	CLOUD_UPLOAD('\uf0ee'),
	CODE('\uf121'),
	CODE_FORK('\uf126'),
	COFFEE('\uf0f4'),
	COG('\uf013'),
	COGS('\uf085'),
	COLUMNS('\uf0db'),
	COMMENT('\uf075'),
	COMMENT_O('\uf0e5'),
	COMMENTS('\uf086'),
	COMMENTS_O('\uf0e6'),
	COMPASS('\uf14e'),
	COMPRESS('\uf066'),
	CREDIT_CARD('\uf09d'),
	CROP('\uf125'),
	CROSSHAIRS('\uf05b'),
	CSS3('\uf13c'),
	CUTLERY('\uf0f5'),
	DESKTOP('\uf108'),
	DOT_CIRCLE_O('\uf192'),
	DOWNLOAD('\uf019'),
	DRIBBBLE('\uf17d'),
	DROPBOX('\uf16b'),
	EJECT('\uf052'),
	ELLIPSIS_H('\uf141'),
	ELLIPSIS_V('\uf142'),
	ENVELOPE('\uf0e0'),
	ENVELOPE_O('\uf003'),
	ERASER('\uf12d'),
	EUR('\uf153'),
	EXCHANGE('\uf0ec'),
	EXCLAMATION('\uf12a'),
	EXCLAMATION_CIRCLE('\uf06a'),
	EXCLAMATION_TRIANGLE('\uf071'),
	EXPAND('\uf065'),
	EXTERNAL_LINK('\uf08e'),
	EXTERNAL_LINK_SQUARE('\uf14c'),
	EYE('\uf06e'),
	EYE_SLASH('\uf070'),
	FACEBOOK('\uf09a'),
	FACEBOOK_SQUARE('\uf082'),
	FAST_BACKWARD('\uf049'),
	FAST_FORWARD('\uf050'),
	FEMALE('\uf182'),
	FIGHTER_JET('\uf0fb'),
	FILE('\uf15b'),
	FILE_O('\uf016'),
	FILE_TEXT('\uf15c'),
	FILE_TEXT_O('\uf0f6'),
	FILES_O('\uf0c5'),
	FILM('\uf008'),
	FILTER('\uf0b0'),
	FIRE('\uf06d'),
	FIRE_EXTINGUISHER('\uf134'),
	FLAG('\uf024'),
	FLAG_CHECKERED('\uf11e'),
	FLAG_O('\uf11d'),
	FLASK('\uf0c3'),
	FLICKR('\uf16e'),
	FLOPPY_O('\uf0c7'),
	FOLDER('\uf07b'),
	FOLDER_O('\uf114'),
	FOLDER_OPEN('\uf07c'),
	FOLDER_OPEN_O('\uf115'),
	FONT('\uf031'),
	FORWARD('\uf04e'),
	FOURSQUARE('\uf180'),
	FROWN_O('\uf119'),
	GAMEPAD('\uf11b'),
	GAVEL('\uf0e3'),
	GBP('\uf154'),
	GIFT('\uf06b'),
	GITHUB('\uf09b'),
	GITHUB_ALT('\uf113'),
	GITHUB_SQUARE('\uf092'),
	GITTIP('\uf184'),
	GLASS('\uf000'),
	GLOBE('\uf0ac'),
	GOOGLE_PLUS('\uf0d5'),
	GOOGLE_PLUS_SQUARE('\uf0d4'),
	H_SQUARE('\uf0fd'),
	HAND_O_DOWN('\uf0a7'),
	HAND_O_LEFT('\uf0a5'),
	HAND_O_RIGHT('\uf0a4'),
	HAND_O_UP('\uf0a6'),
	HDD_O('\uf0a0'),
	HEADPHONES('\uf025'),
	HEART('\uf004'),
	HEART_O('\uf08a'),
	HOME('\uf015'),
	HOSPITAL_O('\uf0f8'),
	HTML5('\uf13b'),
	INBOX('\uf01c'),
	INDENT('\uf03c'),
	INFO('\uf129'),
	INFO_CIRCLE('\uf05a'),
	INR('\uf156'),
	INSTAGRAM('\uf16d'),
	ITALIC('\uf033'),
	JPY('\uf157'),
	KEY('\uf084'),
	KEYBOARD_O('\uf11c'),
	KRW('\uf159'),
	LAPTOP('\uf109'),
	LEAF('\uf06c'),
	LEMON_O('\uf094'),
	LEVEL_DOWN('\uf149'),
	LEVEL_UP('\uf148'),
	LIGHTBULB_O('\uf0eb'),
	LINK('\uf0c1'),
	LINKEDIN('\uf0e1'),
	LINKEDIN_SQUARE('\uf08c'),
	LINUX('\uf17c'),
	LIST('\uf03a'),
	LIST_ALT('\uf022'),
	LIST_OL('\uf0cb'),
	LIST_UL('\uf0ca'),
	LOCATION_ARROW('\uf124'),
	LOCK('\uf023'),
	LONG_ARROW_DOWN('\uf175'),
	LONG_ARROW_LEFT('\uf177'),
	LONG_ARROW_RIGHT('\uf178'),
	LONG_ARROW_UP('\uf176'),
	MAGIC('\uf0d0'),
	MAGNET('\uf076'),
	MAIL_REPLY_ALL('\uf122'),
	MALE('\uf183'),
	MAP_MARKER('\uf041'),
	MAXCDN('\uf136'),
	MEDKIT('\uf0fa'),
	MEH_O('\uf11a'),
	MICROPHONE('\uf130'),
	MICROPHONE_SLASH('\uf131'),
	MINUS('\uf068'),
	MINUS_CIRCLE('\uf056'),
	MINUS_SQUARE('\uf146'),
	MINUS_SQUARE_O('\uf147'),
	MOBILE('\uf10b'),
	MONEY('\uf0d6'),
	MOON_O('\uf186'),
	MUSIC('\uf001'),
	OUTDENT('\uf03b'),
	PAGELINES('\uf18c'),
	PAPERCLIP('\uf0c6'),
	PAUSE('\uf04c'),
	PENCIL('\uf040'),
	PENCIL_SQUARE('\uf14b'),
	PENCIL_SQUARE_O('\uf044'),
	PHONE('\uf095'),
	PHONE_SQUARE('\uf098'),
	PICTURE_O('\uf03e'),
	PINTEREST('\uf0d2'),
	PINTEREST_SQUARE('\uf0d3'),
	PLANE('\uf072'),
	PLAY('\uf04b'),
	PLAY_CIRCLE('\uf144'),
	PLAY_CIRCLE_O('\uf01d'),
	PLUS('\uf067'),
	PLUS_CIRCLE('\uf055'),
	PLUS_SQUARE('\uf0fe'),
	PLUS_SQUARE_O('\uf196'),
	POWER_OFF('\uf011'),
	PRINT('\uf02f'),
	PUZZLE_PIECE('\uf12e'),
	QRCODE('\uf029'),
	QUESTION('\uf128'),
	QUESTION_CIRCLE('\uf059'),
	QUOTE_LEFT('\uf10d'),
	QUOTE_RIGHT('\uf10e'),
	RANDOM('\uf074'),
	REFRESH('\uf021'),
	RENREN('\uf18b'),
	REPEAT('\uf01e'),
	REPLY('\uf112'),
	REPLY_ALL('\uf122'),
	RETWEET('\uf079'),
	ROAD('\uf018'),
	ROCKET('\uf135'),
	RSS('\uf09e'),
	RSS_SQUARE('\uf143'),
	RUB('\uf158'),
	SCISSORS('\uf0c4'),
	SEARCH('\uf002'),
	SEARCH_MINUS('\uf010'),
	SEARCH_PLUS('\uf00e'),
	SHARE('\uf064'),
	SHARE_SQUARE('\uf14d'),
	SHARE_SQUARE_O('\uf045'),
	SHIELD('\uf132'),
	SHOPPING_CART('\uf07a'),
	SIGN_IN('\uf090'),
	SIGN_OUT('\uf08b'),
	SIGNAL('\uf012'),
	SITEMAP('\uf0e8'),
	SKYPE('\uf17e'),
	SMILE_O('\uf118'),
	SORT('\uf0dc'),
	SORT_ALPHA_ASC('\uf15d'),
	SORT_ALPHA_DESC('\uf15e'),
	SORT_AMOUNT_ASC('\uf160'),
	SORT_AMOUNT_DESC('\uf161'),
	SORT_ASC('\uf0dd'),
	SORT_DESC('\uf0de'),
	SORT_NUMERIC_ASC('\uf162'),
	SORT_NUMERIC_DESC('\uf163'),
	SPINNER('\uf110'),
	SQUARE('\uf0c8'),
	SQUARE_O('\uf096'),
	STACK_EXCHANGE('\uf18d'),
	STACK_OVERFLOW('\uf16c'),
	STAR('\uf005'),
	STAR_HALF('\uf089'),
	STAR_HALF_O('\uf123'),
	STAR_O('\uf006'),
	STEP_BACKWARD('\uf048'),
	STEP_FORWARD('\uf051'),
	STETHOSCOPE('\uf0f1'),
	STOP('\uf04d'),
	STRIKETHROUGH('\uf0cc'),
	SUBSCRIPT('\uf12c'),
	SUITCASE('\uf0f2'),
	SUN_O('\uf185'),
	SUPERSCRIPT('\uf12b'),
	TABLE('\uf0ce'),
	TABLET('\uf10a'),
	TACHOMETER('\uf0e4'),
	TAG('\uf02b'),
	TAGS('\uf02c'),
	TASKS('\uf0ae'),
	TERMINAL('\uf120'),
	TEXT_HEIGHT('\uf034'),
	TEXT_WIDTH('\uf035'),
	TH('\uf00a'),
	TH_LARGE('\uf009'),
	TH_LIST('\uf00b'),
	THUMB_TACK('\uf08d'),
	THUMBS_DOWN('\uf165'),
	THUMBS_O_DOWN('\uf088'),
	THUMBS_O_UP('\uf087'),
	THUMBS_UP('\uf164'),
	TICKET('\uf145'),
	TIMES('\uf00d'),
	TIMES_CIRCLE('\uf057'),
	TIMES_CIRCLE_O('\uf05c'),
	TINT('\uf043'),
	TRASH_O('\uf014'),
	TRELLO('\uf181'),
	TROPHY('\uf091'),
	TRUCK('\uf0d1'),
	TRY('\uf195'),
	TUMBLR('\uf173'),
	TUMBLR_SQUARE('\uf174'),
	TWITTER('\uf099'),
	TWITTER_SQUARE('\uf081'),
	UMBRELLA('\uf0e9'),
	UNDERLINE('\uf0cd'),
	UNDO('\uf0e2'),
	UNLOCK('\uf09c'),
	UNLOCK_ALT('\uf13e'),
	UPLOAD('\uf093'),
	USD('\uf155'),
	USER('\uf007'),
	USER_MD('\uf0f0'),
	USERS('\uf0c0'),
	VIDEO_CAMERA('\uf03d'),
	VIMEO_SQUARE('\uf194'),
	VK('\uf189'),
	VOLUME_DOWN('\uf027'),
	VOLUME_OFF('\uf026'),
	VOLUME_UP('\uf028'),
	WEIBO('\uf18a'),
	WHEELCHAIR('\uf193'),
	WINDOWS('\uf17a'),
	WRENCH('\uf0ad'),
	XING('\uf168'),
	XING_SQUARE('\uf169'),
	YOUTUBE('\uf167'),
	YOUTUBE_PLAY('\uf16a'),
	YOUTUBE_SQUARE('\uf166');

	/**
	 * The value
	 */
	private char mValue;

	/**
	 * Loader lock
	 */
	private static Object mLock = new Object();
	
	/**
	 * Font singleton
	 */
	private static Typeface mFont = null;

	FontAwesome(char value) {
		this.mValue = value;
	}

	public static FontAwesome get(char character) {
		for (FontAwesome font : FontAwesome.values()) {
			if (font.mValue == character) {
				return font;
			}
		}
		return null;
	}

	/**
	 * Get the string representation of a FontAwesome character
	 */
	@Override
	public String toString() {
		return Character.toString(mValue);
	}

	/**
	 * Create singleton access to the font resource to conserve memory
	 * 
	 * @param context Context to load the asset with
	 * @param path Path relative to the assets folder
	 * @return
	 */
	public static Typeface font(Context context, String path) {
		synchronized (mLock) {
			if (mFont == null) {
				try {
					mFont = Typeface.createFromAsset(
							context.getAssets(), path);
				} catch (Exception e) {
					Log.e("FontAwesome", "Failed to load typeface '" + path + "' because "
							+ e.getMessage());
					return null;
				}
			}
			return mFont;
		}
	}

	/**
	 * Check if a font has been loaded or not.
	 * 
	 * @return
	 */
	public static boolean isFontLoaded() {
		synchronized (mLock) {
			return mFont != null;
		}
	}

	/**
	 * Be warned! This method will throw a runtime exception if the font has
	 * not been properly loaded. See {@link #font(Context, String)}
	 * 
	 * @return
	 */
	public static Typeface font() {
		synchronized (mLock) {
			if (mFont == null) {
				throw new RuntimeException(
						"FontAwesome is not properly loaded. I told you to "
								+ "call the other font method first..");
			}
			return mFont;
		}
	}
}
