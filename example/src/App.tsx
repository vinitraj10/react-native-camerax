import * as React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import { CameraX, CameraXView } from 'react-native-camerax';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();

  React.useEffect(() => {
    CameraX.multiply(100, 10).then(setResult);
  }, []);

  return (
    <View style={styles.container}>
      <Text>{result}</Text>
      <CameraXView
        src={[
          {
            uri:
              'https://lh4.googleusercontent.com/-fUXp6nSHmk8/AAAAAAAAAAI/AAAAAAAAAAc/-QqZOSP7qGM/s96-c/photo.jpg',
          },
        ]}
        style={{ width: 200, height: 200 }}
        resizeMode="contain"
        borderRadius={40}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
