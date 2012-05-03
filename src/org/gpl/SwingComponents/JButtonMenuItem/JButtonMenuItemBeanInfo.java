
package org.gpl.SwingComponents.JButtonMenuItem;

import java.beans.*;

/**
 *
 * @author Naveed Quadri
 */
public class JButtonMenuItemBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accelerator = 0;
    private static final int PROPERTY_accessibleContext = 1;
    private static final int PROPERTY_action = 2;
    private static final int PROPERTY_actionCommand = 3;
    private static final int PROPERTY_actionListeners = 4;
    private static final int PROPERTY_actionMap = 5;
    private static final int PROPERTY_alignmentX = 6;
    private static final int PROPERTY_alignmentY = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_armed = 9;
    private static final int PROPERTY_autoscrolls = 10;
    private static final int PROPERTY_background = 11;
    private static final int PROPERTY_backgroundSet = 12;
    private static final int PROPERTY_baselineResizeBehavior = 13;
    private static final int PROPERTY_border = 14;
    private static final int PROPERTY_borderPainted = 15;
    private static final int PROPERTY_bounds = 16;
    private static final int PROPERTY_buttons = 17;
    private static final int PROPERTY_buttonSpacing = 18;
    private static final int PROPERTY_buttonStyle = 19;
    private static final int PROPERTY_changeListeners = 20;
    private static final int PROPERTY_colorModel = 21;
    private static final int PROPERTY_component = 22;
    private static final int PROPERTY_componentCount = 23;
    private static final int PROPERTY_componentListeners = 24;
    private static final int PROPERTY_componentOrientation = 25;
    private static final int PROPERTY_componentPopupMenu = 26;
    private static final int PROPERTY_components = 27;
    private static final int PROPERTY_containerListeners = 28;
    private static final int PROPERTY_contentAreaFilled = 29;
    private static final int PROPERTY_cursor = 30;
    private static final int PROPERTY_cursorSet = 31;
    private static final int PROPERTY_debugGraphicsOptions = 32;
    private static final int PROPERTY_disabledIcon = 33;
    private static final int PROPERTY_disabledSelectedIcon = 34;
    private static final int PROPERTY_displayable = 35;
    private static final int PROPERTY_displayedMnemonicIndex = 36;
    private static final int PROPERTY_doubleBuffered = 37;
    private static final int PROPERTY_dropTarget = 38;
    private static final int PROPERTY_enabled = 39;
    private static final int PROPERTY_focusable = 40;
    private static final int PROPERTY_focusCycleRoot = 41;
    private static final int PROPERTY_focusCycleRootAncestor = 42;
    private static final int PROPERTY_focusListeners = 43;
    private static final int PROPERTY_focusOwner = 44;
    private static final int PROPERTY_focusPainted = 45;
    private static final int PROPERTY_focusTraversable = 46;
    private static final int PROPERTY_focusTraversalKeys = 47;
    private static final int PROPERTY_focusTraversalKeysEnabled = 48;
    private static final int PROPERTY_focusTraversalPolicy = 49;
    private static final int PROPERTY_focusTraversalPolicyProvider = 50;
    private static final int PROPERTY_focusTraversalPolicySet = 51;
    private static final int PROPERTY_font = 52;
    private static final int PROPERTY_fontSet = 53;
    private static final int PROPERTY_foreground = 54;
    private static final int PROPERTY_foregroundSet = 55;
    private static final int PROPERTY_graphics = 56;
    private static final int PROPERTY_graphicsConfiguration = 57;
    private static final int PROPERTY_height = 58;
    private static final int PROPERTY_hideActionText = 59;
    private static final int PROPERTY_hierarchyBoundsListeners = 60;
    private static final int PROPERTY_hierarchyListeners = 61;
    private static final int PROPERTY_horizontalAlignment = 62;
    private static final int PROPERTY_horizontalTextPosition = 63;
    private static final int PROPERTY_icon = 64;
    private static final int PROPERTY_iconTextGap = 65;
    private static final int PROPERTY_ignoreRepaint = 66;
    private static final int PROPERTY_inheritsPopupMenu = 67;
    private static final int PROPERTY_inputContext = 68;
    private static final int PROPERTY_inputMap = 69;
    private static final int PROPERTY_inputMethodListeners = 70;
    private static final int PROPERTY_inputMethodRequests = 71;
    private static final int PROPERTY_inputVerifier = 72;
    private static final int PROPERTY_insets = 73;
    private static final int PROPERTY_itemListeners = 74;
    private static final int PROPERTY_keyListeners = 75;
    private static final int PROPERTY_label = 76;
    private static final int PROPERTY_layout = 77;
    private static final int PROPERTY_lightweight = 78;
    private static final int PROPERTY_locale = 79;
    private static final int PROPERTY_location = 80;
    private static final int PROPERTY_locationOnScreen = 81;
    private static final int PROPERTY_managingFocus = 82;
    private static final int PROPERTY_margin = 83;
    private static final int PROPERTY_maximumSize = 84;
    private static final int PROPERTY_maximumSizeSet = 85;
    private static final int PROPERTY_menuDragMouseListeners = 86;
    private static final int PROPERTY_menuKeyListeners = 87;
    private static final int PROPERTY_minimumSize = 88;
    private static final int PROPERTY_minimumSizeSet = 89;
    private static final int PROPERTY_mnemonic = 90;
    private static final int PROPERTY_model = 91;
    private static final int PROPERTY_mouseListeners = 92;
    private static final int PROPERTY_mouseMotionListeners = 93;
    private static final int PROPERTY_mousePosition = 94;
    private static final int PROPERTY_mouseWheelListeners = 95;
    private static final int PROPERTY_multiClickThreshhold = 96;
    private static final int PROPERTY_name = 97;
    private static final int PROPERTY_nextFocusableComponent = 98;
    private static final int PROPERTY_opaque = 99;
    private static final int PROPERTY_optimizedDrawingEnabled = 100;
    private static final int PROPERTY_paintingForPrint = 101;
    private static final int PROPERTY_paintingTile = 102;
    private static final int PROPERTY_parent = 103;
    private static final int PROPERTY_peer = 104;
    private static final int PROPERTY_preferredSize = 105;
    private static final int PROPERTY_preferredSizeSet = 106;
    private static final int PROPERTY_pressedIcon = 107;
    private static final int PROPERTY_propertyChangeListeners = 108;
    private static final int PROPERTY_registeredKeyStrokes = 109;
    private static final int PROPERTY_requestFocusEnabled = 110;
    private static final int PROPERTY_rightButtonMargin = 111;
    private static final int PROPERTY_rolloverEnabled = 112;
    private static final int PROPERTY_rolloverIcon = 113;
    private static final int PROPERTY_rolloverSelectedIcon = 114;
    private static final int PROPERTY_rootPane = 115;
    private static final int PROPERTY_selected = 116;
    private static final int PROPERTY_selectedIcon = 117;
    private static final int PROPERTY_selectedObjects = 118;
    private static final int PROPERTY_showing = 119;
    private static final int PROPERTY_size = 120;
    private static final int PROPERTY_subElements = 121;
    private static final int PROPERTY_text = 122;
    private static final int PROPERTY_toolkit = 123;
    private static final int PROPERTY_toolTipText = 124;
    private static final int PROPERTY_topLevelAncestor = 125;
    private static final int PROPERTY_transferHandler = 126;
    private static final int PROPERTY_treeLock = 127;
    private static final int PROPERTY_UI = 128;
    private static final int PROPERTY_UIClassID = 129;
    private static final int PROPERTY_valid = 130;
    private static final int PROPERTY_validateRoot = 131;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 132;
    private static final int PROPERTY_verticalAlignment = 133;
    private static final int PROPERTY_verticalTextPosition = 134;
    private static final int PROPERTY_vetoableChangeListeners = 135;
    private static final int PROPERTY_visible = 136;
    private static final int PROPERTY_visibleRect = 137;
    private static final int PROPERTY_width = 138;
    private static final int PROPERTY_x = 139;
    private static final int PROPERTY_y = 140;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[141];
    
        try {
            properties[PROPERTY_accelerator] = new PropertyDescriptor ( "accelerator", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getAccelerator", "setAccelerator" ); // NOI18N
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getActionCommand", "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_armed] = new PropertyDescriptor ( "armed", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isArmed", "setArmed" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_borderPainted] = new PropertyDescriptor ( "borderPainted", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isBorderPainted", "setBorderPainted" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_buttons] = new PropertyDescriptor ( "buttons", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getButtons", "setButtons" ); // NOI18N
            properties[PROPERTY_buttonSpacing] = new PropertyDescriptor ( "buttonSpacing", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getButtonSpacing", "setButtonSpacing" ); // NOI18N
            properties[PROPERTY_buttonStyle] = new PropertyDescriptor ( "buttonStyle", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getButtonStyle", "setButtonStyle" ); // NOI18N
            properties[PROPERTY_changeListeners] = new PropertyDescriptor ( "changeListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getChangeListeners", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new PropertyDescriptor ( "component", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentAreaFilled] = new PropertyDescriptor ( "contentAreaFilled", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isContentAreaFilled", "setContentAreaFilled" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_disabledIcon] = new PropertyDescriptor ( "disabledIcon", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getDisabledIcon", "setDisabledIcon" ); // NOI18N
            properties[PROPERTY_disabledSelectedIcon] = new PropertyDescriptor ( "disabledSelectedIcon", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getDisabledSelectedIcon", "setDisabledSelectedIcon" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_displayedMnemonicIndex] = new PropertyDescriptor ( "displayedMnemonicIndex", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getDisplayedMnemonicIndex", "setDisplayedMnemonicIndex" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusPainted] = new PropertyDescriptor ( "focusPainted", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFocusPainted", "setFocusPainted" ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hideActionText] = new PropertyDescriptor ( "hideActionText", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getHideActionText", "setHideActionText" ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalTextPosition] = new PropertyDescriptor ( "horizontalTextPosition", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getHorizontalTextPosition", "setHorizontalTextPosition" ); // NOI18N
            properties[PROPERTY_icon] = new PropertyDescriptor ( "icon", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getIcon", "setIcon" ); // NOI18N
            properties[PROPERTY_iconTextGap] = new PropertyDescriptor ( "iconTextGap", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getIconTextGap", "setIconTextGap" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_itemListeners] = new PropertyDescriptor ( "itemListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getItemListeners", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_label] = new PropertyDescriptor ( "label", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getLabel", "setLabel" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_menuDragMouseListeners] = new PropertyDescriptor ( "menuDragMouseListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMenuDragMouseListeners", null ); // NOI18N
            properties[PROPERTY_menuKeyListeners] = new PropertyDescriptor ( "menuKeyListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMenuKeyListeners", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mnemonic] = new PropertyDescriptor ( "mnemonic", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, null, "setMnemonic" ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_multiClickThreshhold] = new PropertyDescriptor ( "multiClickThreshhold", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getMultiClickThreshhold", "setMultiClickThreshhold" ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_pressedIcon] = new PropertyDescriptor ( "pressedIcon", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getPressedIcon", "setPressedIcon" ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rightButtonMargin] = new PropertyDescriptor ( "rightButtonMargin", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getRightButtonMargin", "setRightButtonMargin" ); // NOI18N
            properties[PROPERTY_rolloverEnabled] = new PropertyDescriptor ( "rolloverEnabled", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isRolloverEnabled", "setRolloverEnabled" ); // NOI18N
            properties[PROPERTY_rolloverIcon] = new PropertyDescriptor ( "rolloverIcon", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getRolloverIcon", "setRolloverIcon" ); // NOI18N
            properties[PROPERTY_rolloverSelectedIcon] = new PropertyDescriptor ( "rolloverSelectedIcon", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getRolloverSelectedIcon", "setRolloverSelectedIcon" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selected] = new PropertyDescriptor ( "selected", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isSelected", "setSelected" ); // NOI18N
            properties[PROPERTY_selectedIcon] = new PropertyDescriptor ( "selectedIcon", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getSelectedIcon", "setSelectedIcon" ); // NOI18N
            properties[PROPERTY_selectedObjects] = new PropertyDescriptor ( "selectedObjects", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getSelectedObjects", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_subElements] = new PropertyDescriptor ( "subElements", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getSubElements", null ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, null, "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_verticalAlignment] = new PropertyDescriptor ( "verticalAlignment", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getVerticalAlignment", "setVerticalAlignment" ); // NOI18N
            properties[PROPERTY_verticalTextPosition] = new PropertyDescriptor ( "verticalTextPosition", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getVerticalTextPosition", "setVerticalTextPosition" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_changeListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_itemListener = 9;
    private static final int EVENT_JButtonMenuItemListener = 10;
    private static final int EVENT_keyListener = 11;
    private static final int EVENT_menuDragMouseListener = 12;
    private static final int EVENT_menuKeyListener = 13;
    private static final int EVENT_mouseListener = 14;
    private static final int EVENT_mouseMotionListener = 15;
    private static final int EVENT_mouseWheelListener = 16;
    private static final int EVENT_propertyChangeListener = 17;
    private static final int EVENT_vetoableChangeListener = 18;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[19];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_changeListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "changeListener", javax.swing.event.ChangeListener.class, new String[] {"stateChanged"}, "addChangeListener", "removeChangeListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_itemListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "itemListener", java.awt.event.ItemListener.class, new String[] {"itemStateChanged"}, "addItemListener", "removeItemListener" ); // NOI18N
            eventSets[EVENT_JButtonMenuItemListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "JButtonMenuItemListener", org.gpl.SwingComponents.JButtonMenuItem.Events.JButtonMenuItemListener.class, new String[] {"buttonClicked"}, "addJButtonMenuItemListener", "removeJButtonMenuItemListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_menuDragMouseListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "menuDragMouseListener", javax.swing.event.MenuDragMouseListener.class, new String[] {"menuDragMouseEntered", "menuDragMouseExited", "menuDragMouseDragged", "menuDragMouseReleased"}, "addMenuDragMouseListener", "removeMenuDragMouseListener" ); // NOI18N
            eventSets[EVENT_menuKeyListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "menuKeyListener", javax.swing.event.MenuKeyListener.class, new String[] {"menuKeyTyped", "menuKeyPressed", "menuKeyReleased"}, "addMenuKeyListener", "removeMenuKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_actionPerformed1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createToolTip21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_deliverEvent24 = 24;
    private static final int METHOD_disable25 = 25;
    private static final int METHOD_dispatchEvent26 = 26;
    private static final int METHOD_doClick27 = 27;
    private static final int METHOD_doClick28 = 28;
    private static final int METHOD_doLayout29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enableInputMethods32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_getActionForKeyStroke43 = 43;
    private static final int METHOD_getBaseline44 = 44;
    private static final int METHOD_getBounds45 = 45;
    private static final int METHOD_getClientProperty46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentZOrder49 = 49;
    private static final int METHOD_getConditionForKeyStroke50 = 50;
    private static final int METHOD_getDefaultLocale51 = 51;
    private static final int METHOD_getFocusTraversalKeys52 = 52;
    private static final int METHOD_getFontMetrics53 = 53;
    private static final int METHOD_getInsets54 = 54;
    private static final int METHOD_getListeners55 = 55;
    private static final int METHOD_getLocation56 = 56;
    private static final int METHOD_getMnemonic57 = 57;
    private static final int METHOD_getMousePosition58 = 58;
    private static final int METHOD_getPopupLocation59 = 59;
    private static final int METHOD_getPropertyChangeListeners60 = 60;
    private static final int METHOD_getSize61 = 61;
    private static final int METHOD_getToolTipLocation62 = 62;
    private static final int METHOD_getToolTipText63 = 63;
    private static final int METHOD_getUI64 = 64;
    private static final int METHOD_gotFocus65 = 65;
    private static final int METHOD_grabFocus66 = 66;
    private static final int METHOD_handleEvent67 = 67;
    private static final int METHOD_hasFocus68 = 68;
    private static final int METHOD_hide69 = 69;
    private static final int METHOD_imageUpdate70 = 70;
    private static final int METHOD_insets71 = 71;
    private static final int METHOD_inside72 = 72;
    private static final int METHOD_invalidate73 = 73;
    private static final int METHOD_isAncestorOf74 = 74;
    private static final int METHOD_isFocusCycleRoot75 = 75;
    private static final int METHOD_isLightweightComponent76 = 76;
    private static final int METHOD_keyDown77 = 77;
    private static final int METHOD_keyUp78 = 78;
    private static final int METHOD_layout79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_list81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_locate85 = 85;
    private static final int METHOD_location86 = 86;
    private static final int METHOD_lostFocus87 = 87;
    private static final int METHOD_menuSelectionChanged88 = 88;
    private static final int METHOD_minimumSize89 = 89;
    private static final int METHOD_mouseClicked90 = 90;
    private static final int METHOD_mouseDown91 = 91;
    private static final int METHOD_mouseDrag92 = 92;
    private static final int METHOD_mouseDragged93 = 93;
    private static final int METHOD_mouseEnter94 = 94;
    private static final int METHOD_mouseEntered95 = 95;
    private static final int METHOD_mouseExit96 = 96;
    private static final int METHOD_mouseExited97 = 97;
    private static final int METHOD_mouseMove98 = 98;
    private static final int METHOD_mouseMoved99 = 99;
    private static final int METHOD_mousePressed100 = 100;
    private static final int METHOD_mouseReleased101 = 101;
    private static final int METHOD_mouseUp102 = 102;
    private static final int METHOD_move103 = 103;
    private static final int METHOD_nextFocus104 = 104;
    private static final int METHOD_paint105 = 105;
    private static final int METHOD_paintAll106 = 106;
    private static final int METHOD_paintComponents107 = 107;
    private static final int METHOD_paintImmediately108 = 108;
    private static final int METHOD_paintImmediately109 = 109;
    private static final int METHOD_postEvent110 = 110;
    private static final int METHOD_preferredSize111 = 111;
    private static final int METHOD_prepareImage112 = 112;
    private static final int METHOD_prepareImage113 = 113;
    private static final int METHOD_print114 = 114;
    private static final int METHOD_printAll115 = 115;
    private static final int METHOD_printComponents116 = 116;
    private static final int METHOD_processKeyEvent117 = 117;
    private static final int METHOD_processMenuDragMouseEvent118 = 118;
    private static final int METHOD_processMenuKeyEvent119 = 119;
    private static final int METHOD_processMouseEvent120 = 120;
    private static final int METHOD_putClientProperty121 = 121;
    private static final int METHOD_registerKeyboardAction122 = 122;
    private static final int METHOD_registerKeyboardAction123 = 123;
    private static final int METHOD_remove124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_remove126 = 126;
    private static final int METHOD_removeAll127 = 127;
    private static final int METHOD_removeNotify128 = 128;
    private static final int METHOD_removePropertyChangeListener129 = 129;
    private static final int METHOD_repaint130 = 130;
    private static final int METHOD_repaint131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_repaint134 = 134;
    private static final int METHOD_requestDefaultFocus135 = 135;
    private static final int METHOD_requestFocus136 = 136;
    private static final int METHOD_requestFocus137 = 137;
    private static final int METHOD_requestFocusInWindow138 = 138;
    private static final int METHOD_resetKeyboardActions139 = 139;
    private static final int METHOD_reshape140 = 140;
    private static final int METHOD_resize141 = 141;
    private static final int METHOD_resize142 = 142;
    private static final int METHOD_revalidate143 = 143;
    private static final int METHOD_scrollRectToVisible144 = 144;
    private static final int METHOD_setBounds145 = 145;
    private static final int METHOD_setComponentZOrder146 = 146;
    private static final int METHOD_setDefaultLocale147 = 147;
    private static final int METHOD_setMnemonic148 = 148;
    private static final int METHOD_setUI149 = 149;
    private static final int METHOD_show150 = 150;
    private static final int METHOD_show151 = 151;
    private static final int METHOD_size152 = 152;
    private static final int METHOD_toString153 = 153;
    private static final int METHOD_transferFocus154 = 154;
    private static final int METHOD_transferFocusBackward155 = 155;
    private static final int METHOD_transferFocusDownCycle156 = 156;
    private static final int METHOD_transferFocusUpCycle157 = 157;
    private static final int METHOD_unregisterKeyboardAction158 = 158;
    private static final int METHOD_update159 = 159;
    private static final int METHOD_updateUI160 = 160;
    private static final int METHOD_validate161 = 161;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[162];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_actionPerformed1] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("actionPerformed", new Class[] {java.awt.event.ActionEvent.class})); // NOI18N
            methods[METHOD_actionPerformed1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createToolTip21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_deliverEvent24] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent24].setDisplayName ( "" );
            methods[METHOD_disable25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable25].setDisplayName ( "" );
            methods[METHOD_dispatchEvent26] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent26].setDisplayName ( "" );
            methods[METHOD_doClick27] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("doClick", new Class[] {})); // NOI18N
            methods[METHOD_doClick27].setDisplayName ( "" );
            methods[METHOD_doClick28] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("doClick", new Class[] {int.class})); // NOI18N
            methods[METHOD_doClick28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enableInputMethods32] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke43].setDisplayName ( "" );
            methods[METHOD_getBaseline44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline44].setDisplayName ( "" );
            methods[METHOD_getBounds45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds45].setDisplayName ( "" );
            methods[METHOD_getClientProperty46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder49].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke50].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale51].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys52] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys52].setDisplayName ( "" );
            methods[METHOD_getFontMetrics53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics53].setDisplayName ( "" );
            methods[METHOD_getInsets54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets54].setDisplayName ( "" );
            methods[METHOD_getListeners55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners55].setDisplayName ( "" );
            methods[METHOD_getLocation56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation56].setDisplayName ( "" );
            methods[METHOD_getMnemonic57] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("getMnemonic", new Class[] {})); // NOI18N
            methods[METHOD_getMnemonic57].setDisplayName ( "" );
            methods[METHOD_getMousePosition58] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition58].setDisplayName ( "" );
            methods[METHOD_getPopupLocation59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation59].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners60] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners60].setDisplayName ( "" );
            methods[METHOD_getSize61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize61].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation62].setDisplayName ( "" );
            methods[METHOD_getToolTipText63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText63].setDisplayName ( "" );
            methods[METHOD_getUI64] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("getUI", new Class[] {})); // NOI18N
            methods[METHOD_getUI64].setDisplayName ( "" );
            methods[METHOD_gotFocus65] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus65].setDisplayName ( "" );
            methods[METHOD_grabFocus66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus66].setDisplayName ( "" );
            methods[METHOD_handleEvent67] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent67].setDisplayName ( "" );
            methods[METHOD_hasFocus68] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus68].setDisplayName ( "" );
            methods[METHOD_hide69] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide69].setDisplayName ( "" );
            methods[METHOD_imageUpdate70] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate70].setDisplayName ( "" );
            methods[METHOD_insets71] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets71].setDisplayName ( "" );
            methods[METHOD_inside72] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside72].setDisplayName ( "" );
            methods[METHOD_invalidate73] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate73].setDisplayName ( "" );
            methods[METHOD_isAncestorOf74] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf74].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot75] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot75].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent76] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent76].setDisplayName ( "" );
            methods[METHOD_keyDown77] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown77].setDisplayName ( "" );
            methods[METHOD_keyUp78] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp78].setDisplayName ( "" );
            methods[METHOD_layout79] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_list81] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_locate85] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate85].setDisplayName ( "" );
            methods[METHOD_location86] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location86].setDisplayName ( "" );
            methods[METHOD_lostFocus87] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus87].setDisplayName ( "" );
            methods[METHOD_menuSelectionChanged88] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("menuSelectionChanged", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_menuSelectionChanged88].setDisplayName ( "" );
            methods[METHOD_minimumSize89] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize89].setDisplayName ( "" );
            methods[METHOD_mouseClicked90] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("mouseClicked", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseClicked90].setDisplayName ( "" );
            methods[METHOD_mouseDown91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown91].setDisplayName ( "" );
            methods[METHOD_mouseDrag92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag92].setDisplayName ( "" );
            methods[METHOD_mouseDragged93] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("mouseDragged", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseDragged93].setDisplayName ( "" );
            methods[METHOD_mouseEnter94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter94].setDisplayName ( "" );
            methods[METHOD_mouseEntered95] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("mouseEntered", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseEntered95].setDisplayName ( "" );
            methods[METHOD_mouseExit96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit96].setDisplayName ( "" );
            methods[METHOD_mouseExited97] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("mouseExited", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseExited97].setDisplayName ( "" );
            methods[METHOD_mouseMove98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove98].setDisplayName ( "" );
            methods[METHOD_mouseMoved99] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("mouseMoved", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseMoved99].setDisplayName ( "" );
            methods[METHOD_mousePressed100] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("mousePressed", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mousePressed100].setDisplayName ( "" );
            methods[METHOD_mouseReleased101] = new MethodDescriptor(org.gpl.SwingComponents.JButtonMenuItem.JButtonMenuItem.class.getMethod("mouseReleased", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseReleased101].setDisplayName ( "" );
            methods[METHOD_mouseUp102] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp102].setDisplayName ( "" );
            methods[METHOD_move103] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move103].setDisplayName ( "" );
            methods[METHOD_nextFocus104] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus104].setDisplayName ( "" );
            methods[METHOD_paint105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint105].setDisplayName ( "" );
            methods[METHOD_paintAll106] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll106].setDisplayName ( "" );
            methods[METHOD_paintComponents107] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents107].setDisplayName ( "" );
            methods[METHOD_paintImmediately108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately108].setDisplayName ( "" );
            methods[METHOD_paintImmediately109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately109].setDisplayName ( "" );
            methods[METHOD_postEvent110] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent110].setDisplayName ( "" );
            methods[METHOD_preferredSize111] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize111].setDisplayName ( "" );
            methods[METHOD_prepareImage112] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage112].setDisplayName ( "" );
            methods[METHOD_prepareImage113] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage113].setDisplayName ( "" );
            methods[METHOD_print114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print114].setDisplayName ( "" );
            methods[METHOD_printAll115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll115].setDisplayName ( "" );
            methods[METHOD_printComponents116] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents116].setDisplayName ( "" );
            methods[METHOD_processKeyEvent117] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processKeyEvent", new Class[] {java.awt.event.KeyEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processKeyEvent117].setDisplayName ( "" );
            methods[METHOD_processMenuDragMouseEvent118] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMenuDragMouseEvent", new Class[] {javax.swing.event.MenuDragMouseEvent.class})); // NOI18N
            methods[METHOD_processMenuDragMouseEvent118].setDisplayName ( "" );
            methods[METHOD_processMenuKeyEvent119] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMenuKeyEvent", new Class[] {javax.swing.event.MenuKeyEvent.class})); // NOI18N
            methods[METHOD_processMenuKeyEvent119].setDisplayName ( "" );
            methods[METHOD_processMouseEvent120] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMouseEvent", new Class[] {java.awt.event.MouseEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processMouseEvent120].setDisplayName ( "" );
            methods[METHOD_putClientProperty121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty121].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction122].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction123].setDisplayName ( "" );
            methods[METHOD_remove124] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_remove126] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove126].setDisplayName ( "" );
            methods[METHOD_removeAll127] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll127].setDisplayName ( "" );
            methods[METHOD_removeNotify128] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify128].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener129] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener129].setDisplayName ( "" );
            methods[METHOD_repaint130] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint130].setDisplayName ( "" );
            methods[METHOD_repaint131] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_repaint134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint134].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus135].setDisplayName ( "" );
            methods[METHOD_requestFocus136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus136].setDisplayName ( "" );
            methods[METHOD_requestFocus137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus137].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow138].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions139].setDisplayName ( "" );
            methods[METHOD_reshape140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape140].setDisplayName ( "" );
            methods[METHOD_resize141] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize141].setDisplayName ( "" );
            methods[METHOD_resize142] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize142].setDisplayName ( "" );
            methods[METHOD_revalidate143] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate143].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible144].setDisplayName ( "" );
            methods[METHOD_setBounds145] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds145].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder146] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder146].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale147].setDisplayName ( "" );
            methods[METHOD_setMnemonic148] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("setMnemonic", new Class[] {int.class})); // NOI18N
            methods[METHOD_setMnemonic148].setDisplayName ( "" );
            methods[METHOD_setUI149] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("setUI", new Class[] {javax.swing.plaf.ButtonUI.class})); // NOI18N
            methods[METHOD_setUI149].setDisplayName ( "" );
            methods[METHOD_show150] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show150].setDisplayName ( "" );
            methods[METHOD_show151] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show151].setDisplayName ( "" );
            methods[METHOD_size152] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size152].setDisplayName ( "" );
            methods[METHOD_toString153] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString153].setDisplayName ( "" );
            methods[METHOD_transferFocus154] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus154].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward155] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward155].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle156] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle156].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle157].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction158] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction158].setDisplayName ( "" );
            methods[METHOD_update159] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update159].setDisplayName ( "" );
            methods[METHOD_updateUI160] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI160].setDisplayName ( "" );
            methods[METHOD_validate161] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate161].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

    // Here you can add code for customizing the methods array.
    
        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "org/gpl/components/JButtonMenuItem/resources/jbutton_menu_item_16.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "org/gpl/components/JButtonMenuItem/resources/jbutton_menu_item_32.png";
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

    
//GEN-FIRST:Superclass

    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
	
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     * 
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
	return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     * 
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
	return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     * 
     * @return  An array of EventSetDescriptors describing the kinds of 
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
	return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     * 
     * @return  An array of MethodDescriptors describing the methods 
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
	return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are 
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean. 
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to
     * represent the bean in toolboxes, toolbars, etc.   Icon images
     * will typically be GIFs, but may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from
     * this method.
     * <p>
     * There are four possible flavors of icons (16x16 color,
     * 32x32 color, 16x16 mono, 32x32 mono).  If a bean choses to only
     * support a single icon we recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background
     * so they can be rendered onto an existing background.
     *
     * @param  iconKind  The kind of icon requested.  This should be
     *    one of the constant values ICON_COLOR_16x16, ICON_COLOR_32x32, 
     *    ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return  An image object representing the requested icon.  May
     *    return null if no suitable icon is available.
     */
    public java.awt.Image getIcon(int iconKind) {
        switch ( iconKind ) {
        case ICON_COLOR_16x16:
            if ( iconNameC16 == null )
                return null;
            else {
                if( iconColor16 == null )
                    iconColor16 = loadImage( iconNameC16 );
                return iconColor16;
            }
        case ICON_COLOR_32x32:
            if ( iconNameC32 == null )
                return null;
            else {
                if( iconColor32 == null )
                    iconColor32 = loadImage( iconNameC32 );
                return iconColor32;
            }
        case ICON_MONO_16x16:
            if ( iconNameM16 == null )
                return null;
            else {
                if( iconMono16 == null )
                    iconMono16 = loadImage( iconNameM16 );
                return iconMono16;
            }
        case ICON_MONO_32x32:
            if ( iconNameM32 == null )
                return null;
            else {
                if( iconMono32 == null )
                    iconMono32 = loadImage( iconNameM32 );
                return iconMono32;
            }
	default: return null;
        }
    }

}

