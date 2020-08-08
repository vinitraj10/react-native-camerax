import { NativeModules } from 'react-native';

type CameraxType = {
  multiply(a: number, b: number): Promise<number>;
};

const { Camerax } = NativeModules;

export default Camerax as CameraxType;
