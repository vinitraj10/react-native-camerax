import { requireNativeComponent } from 'react-native';

/**
 * Composes `View`.
 *
 * - src: string
 * - borderRadius: number
 * - resizeMode: 'cover' | 'contain' | 'stretch'
 */
const CameraXView = requireNativeComponent('RCTCameraXView');
// console.log('CameraXvIEW', CameraXView);
export default CameraXView;
