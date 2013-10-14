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
	ANGLE_DOWN('\uf107'),
	ANGLE_LEFT('\uf104'),
	ANGLE_RIGHT('\uf105'),
	ANGLE_UP('\uf106'),
	APPLE('\uf179'),
	ARCHIVE('\uf187'),
	ARROW_DOWN('\uf063'),
	ARROW_LEFT('\uf060'),
	ARROW_RIGHT('\uf061'),
	ARROW_UP('\uf062'),
	ASTERISK('\uf069'),
	BACKWARD('\uf04a'),
	BAN_CIRCLE('\uf05e'),
	BAR_CHART('\uf080'),
	BARCODE('\uf02a'),
	BEAKER('\uf0c3'),
	BEER('\uf0fc'),
	BELL('\uf0a2'),
	BELL_ALT('\uf0f3'),
	BITBUCKET('\uf171'),
	BITBUCKET_SIGN('\uf172'),
	BOLD('\uf032'),
	BOLT('\uf0e7'),
	BOOK('\uf02d'),
	BOOKMARK('\uf02e'),
	BOOKMARK_EMPTY('\uf097'),
	BRIEFCASE('\uf0b1'),
	BTC('\uf15a'),
	BUG('\uf188'),
	BUILDING('\uf0f7'),
	BULLHORN('\uf0a1'),
	BULLSEYE('\uf140'),
	CALENDAR('\uf073'),
	CALENDAR_EMPTY('\uf133'),
	CAMERA('\uf030'),
	CAMERA_RETRO('\uf083'),
	CARET_DOWN('\uf0d7'),
	CARET_LEFT('\uf0d9'),
	CARET_RIGHT('\uf0da'),
	CARET_UP('\uf0d8'),
	CERTIFICATE('\uf0a3'),
	CHECK('\uf046'),
	CHECK_EMPTY('\uf096'),
	CHECK_MINUS('\uf147'),
	CHECK_SIGN('\uf14a'),
	CHEVRON_DOWN('\uf078'),
	CHEVRON_LEFT('\uf053'),
	CHEVRON_RIGHT('\uf054'),
	CHEVRON_SIGN_DOWN('\uf13a'),
	CHEVRON_SIGN_LEFT('\uf137'),
	CHEVRON_SIGN_RIGHT('\uf138'),
	CHEVRON_SIGN_UP('\uf139'),
	CHEVRON_UP('\uf077'),
	CIRCLE('\uf111'),
	CIRCLE_ARROW_DOWN('\uf0ab'),
	CIRCLE_ARROW_LEFT('\uf0a8'),
	CIRCLE_ARROW_RIGHT('\uf0a9'),
	CIRCLE_ARROW_UP('\uf0aa'),
	CIRCLE_BLANK('\uf10c'),
	CLOUD('\uf0c2'),
	CLOUD_DOWNLOAD('\uf0ed'),
	CLOUD_UPLOAD('\uf0ee'),
	CNY('\uf158'),
	CODE('\uf121'),
	CODE_FORK('\uf126'),
	COFFEE('\uf0f4'),
	COG('\uf013'),
	COGS('\uf085'),
	COLLAPSE('\uf150'),
	COLLAPSE_ALT('\uf117'),
	COLLAPSE_TOP('\uf151'),
	COLUMNS('\uf0db'),
	COMMENT('\uf075'),
	COMMENT_ALT('\uf0e5'),
	COMMENTS('\uf086'),
	COMMENTS_ALT('\uf0e6'),
	COMPASS('\uf14e'),
	COPY('\uf0c5'),
	CREDIT_CARD('\uf09d'),
	CROP('\uf125'),
	CSS3('\uf13c'),
	CUT('\uf0c4'),
	DASHBOARD('\uf0e4'),
	DESKTOP('\uf108'),
	DOUBLE_ANGLE_DOWN('\uf103'),
	DOUBLE_ANGLE_LEFT('\uf100'),
	DOUBLE_ANGLE_RIGHT('\uf101'),
	DOUBLE_ANGLE_UP('\uf102'),
	DOWNLOAD('\uf01a'),
	DOWNLOAD_ALT('\uf019'),
	DRIBBBLE('\uf17d'),
	DROPBOX('\uf16b'),
	EDIT('\uf044'),
	EDIT_SIGN('\uf14b'),
	EJECT('\uf052'),
	ELLIPSIS_HORIZONTAL('\uf141'),
	ELLIPSIS_VERTICAL('\uf142'),
	ENVELOPE('\uf0e0'),
	ENVELOPE_ALT('\uf003'),
	ERASER('\uf12d'),
	EUR('\uf153'),
	EXCHANGE('\uf0ec'),
	EXCLAMATION('\uf12a'),
	EXCLAMATION_SIGN('\uf06a'),
	EXPAND('\uf152'),
	EXPAND_ALT('\uf116'),
	EXTERNAL_LINK('\uf08e'),
	EXTERNAL_LINK_SIGN('\uf14c'),
	EYE_CLOSE('\uf070'),
	EYE_OPEN('\uf06e'),
	FACEBOOK('\uf09a'),
	FACEBOOK_SIGN('\uf082'),
	FACETIME_VIDEO('\uf03d'),
	FAST_BACKWARD('\uf049'),
	FAST_FORWARD('\uf050'),
	FEMALE('\uf182'),
	FIGHTER_JET('\uf0fb'),
	FILE('\uf15b'),
	FILE_ALT('\uf016'),
	FILE_TEXT('\uf15c'),
	FILE_TEXT_ALT('\uf0f6'),
	FILM('\uf008'),
	FILTER('\uf0b0'),
	FIRE('\uf06d'),
	FIRE_EXTINGUISHER('\uf134'),
	FLAG('\uf024'),
	FLAG_ALT('\uf11d'),
	FLAG_CHECKERED('\uf11e'),
	FLICKR('\uf16e'),
	FOLDER_CLOSE('\uf07b'),
	FOLDER_CLOSE_ALT('\uf114'),
	FOLDER_OPEN('\uf07c'),
	FOLDER_OPEN_ALT('\uf115'),
	FONT('\uf031'),
	FOOD('\uf0f5'),
	FORWARD('\uf04e'),
	FOURSQUARE('\uf180'),
	FROWN('\uf119'),
	FULLSCREEN('\uf0b2'),
	GAMEPAD('\uf11b'),
	GBP('\uf154'),
	GIFT('\uf06b'),
	GITHUB('\uf09b'),
	GITHUB_ALT('\uf113'),
	GITHUB_SIGN('\uf092'),
	GITTIP('\uf184'),
	GLASS('\uf000'),
	GLOBE('\uf0ac'),
	GOOGLE_PLUS('\uf0d5'),
	GOOGLE_PLUS_SIGN('\uf0d4'),
	GROUP('\uf0c0'),
	H_SIGN('\uf0fd'),
	HAND_DOWN('\uf0a7'),
	HAND_LEFT('\uf0a5'),
	HAND_RIGHT('\uf0a4'),
	HAND_UP('\uf0a6'),
	HDD('\uf0a0'),
	HEADPHONES('\uf025'),
	HEART('\uf004'),
	HEART_EMPTY('\uf08a'),
	HOME('\uf015'),
	HOSPITAL('\uf0f8'),
	HTML5('\uf13b'),
	INBOX('\uf01c'),
	INDENT_LEFT('\uf03b'),
	INDENT_RIGHT('\uf03c'),
	INFO('\uf129'),
	INFO_SIGN('\uf05a'),
	INR('\uf156'),
	INSTAGRAM('\uf16d'),
	ITALIC('\uf033'),
	JPY('\uf157'),
	KEY('\uf084'),
	KEYBOARD('\uf11c'),
	KRW('\uf159'),
	LAPTOP('\uf109'),
	LEAF('\uf06c'),
	LEGAL('\uf0e3'),
	LEMON('\uf094'),
	LEVEL_DOWN('\uf149'),
	LEVEL_UP('\uf148'),
	LIGHTBULB('\uf0eb'),
	LINK('\uf0c1'),
	LINKEDIN('\uf0e1'),
	LINKEDIN_SIGN('\uf08c'),
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
	MEH('\uf11a'),
	MICROPHONE('\uf130'),
	MICROPHONE_OFF('\uf131'),
	MINUS('\uf068'),
	MINUS_SIGN('\uf056'),
	MINUS_SIGN_ALT('\uf146'),
	MOBILE_PHONE('\uf10b'),
	MONEY('\uf0d6'),
	MOON('\uf186'),
	MOVE('\uf047'),
	MUSIC('\uf001'),
	OFF('\uf011'),
	OK('\uf00c'),
	OK_CIRCLE('\uf05d'),
	OK_SIGN('\uf058'),
	PAPER_CLIP('\uf0c6'),
	PASTE('\uf0ea'),
	PAUSE('\uf04c'),
	PENCIL('\uf040'),
	PHONE('\uf095'),
	PHONE_SIGN('\uf098'),
	PICTURE('\uf03e'),
	PINTEREST('\uf0d2'),
	PINTEREST_SIGN('\uf0d3'),
	PLANE('\uf072'),
	PLAY('\uf04b'),
	PLAY_CIRCLE('\uf01d'),
	PLAY_SIGN('\uf144'),
	PLUS('\uf067'),
	PLUS_SIGN('\uf055'),
	PLUS_SIGN_ALT('\uf0fe'),
	PRINT('\uf02f'),
	PUSHPIN('\uf08d'),
	PUZZLE_PIECE('\uf12e'),
	QRCODE('\uf029'),
	QUESTION('\uf128'),
	QUESTION_SIGN('\uf059'),
	QUOTE_LEFT('\uf10d'),
	QUOTE_RIGHT('\uf10e'),
	RANDOM('\uf074'),
	REFRESH('\uf021'),
	REMOVE('\uf00d'),
	REMOVE_CIRCLE('\uf05c'),
	REMOVE_SIGN('\uf057'),
	RENREN('\uf18b'),
	REORDER('\uf0c9'),
	REPEAT('\uf01e'),
	REPLY('\uf112'),
	REPLY_ALL('\uf122'),
	RESIZE_FULL('\uf065'),
	RESIZE_HORIZONTAL('\uf07e'),
	RESIZE_SMALL('\uf066'),
	RESIZE_VERTICAL('\uf07d'),
	RETWEET('\uf079'),
	ROAD('\uf018'),
	ROCKET('\uf135'),
	RSS('\uf09e'),
	RSS_SIGN('\uf143'),
	SAVE('\uf0c7'),
	SCREENSHOT('\uf05b'),
	SEARCH('\uf002'),
	SHARE('\uf045'),
	SHARE_ALT('\uf064'),
	SHARE_SIGN('\uf14d'),
	SHIELD('\uf132'),
	SHOPPING_CART('\uf07a'),
	SIGN_BLANK('\uf0c8'),
	SIGNAL('\uf012'),
	SIGNIN('\uf090'),
	SIGNOUT('\uf08b'),
	SITEMAP('\uf0e8'),
	SKYPE('\uf17e'),
	SMILE('\uf118'),
	SORT('\uf0dc'),
	SORT_BY_ALPHABET('\uf15d'),
	SORT_BY_ALPHABET_ALT('\uf15e'),
	SORT_BY_ATTRIBUTES('\uf160'),
	SORT_BY_ATTRIBUTES_ALT('\uf161'),
	SORT_BY_ORDER('\uf162'),
	SORT_BY_ORDER_ALT('\uf163'),
	SORT_DOWN('\uf0dd'),
	SORT_UP('\uf0de'),
	SPINNER('\uf110'),
	STACKEXCHANGE('\uf16c'),
	STAR('\uf005'),
	STAR_EMPTY('\uf006'),
	STAR_HALF('\uf089'),
	STAR_HALF_EMPTY('\uf123'),
	STEP_BACKWARD('\uf048'),
	STEP_FORWARD('\uf051'),
	STETHOSCOPE('\uf0f1'),
	STOP('\uf04d'),
	STRIKETHROUGH('\uf0cc'),
	SUBSCRIPT('\uf12c'),
	SUITCASE('\uf0f2'),
	SUN('\uf185'),
	SUPERSCRIPT('\uf12b'),
	TABLE('\uf0ce'),
	TABLET('\uf10a'),
	TAG('\uf02b'),
	TAGS('\uf02c'),
	TASKS('\uf0ae'),
	TERMINAL('\uf120'),
	TEXT_HEIGHT('\uf034'),
	TEXT_WIDTH('\uf035'),
	TH('\uf00a'),
	TH_LARGE('\uf009'),
	TH_LIST('\uf00b'),
	THUMBS_DOWN('\uf165'),
	THUMBS_DOWN_ALT('\uf088'),
	THUMBS_UP('\uf164'),
	THUMBS_UP_ALT('\uf087'),
	TICKET('\uf145'),
	TIME('\uf017'),
	TINT('\uf043'),
	TRASH('\uf014'),
	TRELLO('\uf181'),
	TROPHY('\uf091'),
	TRUCK('\uf0d1'),
	TUMBLR('\uf173'),
	TUMBLR_SIGN('\uf174'),
	TWITTER('\uf099'),
	TWITTER_SIGN('\uf081'),
	UMBRELLA('\uf0e9'),
	UNDERLINE('\uf0cd'),
	UNDO('\uf0e2'),
	UNLINK('\uf127'),
	UNLOCK('\uf09c'),
	UNLOCK_ALT('\uf13e'),
	UPLOAD('\uf01b'),
	UPLOAD_ALT('\uf093'),
	USD('\uf155'),
	USER('\uf007'),
	USER_MD('\uf0f0'),
	VK('\uf189'),
	VOLUME_DOWN('\uf027'),
	VOLUME_OFF('\uf026'),
	VOLUME_UP('\uf028'),
	WARNING_SIGN('\uf071'),
	WEIBO('\uf18a'),
	WINDOWS('\uf17a'),
	WRENCH('\uf0ad'),
	XING('\uf168'),
	XING_SIGN('\uf169'),
	YOUTUBE('\uf167'),
	YOUTUBE_PLAY('\uf16a'),
	YOUTUBE_SIGN('\uf166'),
	ZOOM_IN('\uf00e'),
	ZOOM_OUT('\uf010');

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
