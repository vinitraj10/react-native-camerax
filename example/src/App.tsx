import * as React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import { CameraXView } from 'react-native-camerax';

export default function App() {
  return (
    <View style={styles.container}>
      <CameraXView style={{ flex: 1 }}>
        <Text style={{ color: '#00d09c' }}>Vinit</Text>
      </CameraXView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
});
