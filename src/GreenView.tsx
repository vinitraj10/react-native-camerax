import { requireNativeComponent } from 'react-native';

/**
 * Composes `View`.
 *
 * - src: string
 * - borderRadius: number
 * - resizeMode: 'cover' | 'contain' | 'stretch'
 */
const GreenView = requireNativeComponent('RCTGreenView');
// console.log('GreenView', GreenView);
export default GreenView;
